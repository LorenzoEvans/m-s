(ns maybe-sheep.core
  (:require
   [maybe-sheep.routing :refer [path-for router]]
   [reagent.session :as session]
   [re-frame.core :refer [dispatch dispatch-sync clear-subscription-cache!]]
   [reagent.core :as reagent]
   [reitit.frontend :as reitit]
   [clerk.core :as clerk]
   [accountant.core :as accountant]
   [maybe-sheep.pages.homepage :refer [home-page]]
   [maybe-sheep.pages.about :refer [about-page]]
   [maybe-sheep.pages.post :refer [post-page]]
   [maybe-sheep.styles :refer [current-page-buttons current-page-buttons-container]]
   [maybe-sheep.pages.posts :refer [posts-page]]
   [maybe-sheep.pages.misc :refer [misc-page]]))
   

;; -------------------------
;; Routes


;; -------------------------
;; Page components

(defn ^:export init []
  (routing/start!)
  (dispatch-sync [:initialize-db]))

(reagent/render [maybe-sheep.layout/application]
  (.getElementById js/document "app"))

;; -------------------------
;; Translate routes -> page components

(defn page-for [route]
  (case route
    :index #'home-page
    :about #'about-page
    :posts #'posts-page
    :post #'post-page
    :misc #'misc-page))
    


; (def current-post
;   (atom {:current-post nil}))


; @current-post

;; -------------------------
;; Page mounting component

(defn current-page []
  (fn []
    (let [page (:current-page (session/get :route))]
      [:div.moon-gray.vh-100.flex.flex-row.justify-between
       [:div.flex.flex-column.justify-around.vh-100.bw2.content-center.items-center.w-40-m
        [:span {:class current-page-buttons-container} [:a {:class current-page-buttons :href (path-for :index)} "Home"]]
        [:span {:class current-page-buttons-container} [:a {:class current-page-buttons :href (path-for :about)} "About"]]
        [:span {:class current-page-buttons-container} [:a {:class current-page-buttons :href (path-for :posts)} "Posts!"]]
        [:span {:class current-page-buttons-container} [:a {:class current-page-buttons :href (path-for :misc)} "Misc!"]]]
        
       [page]])))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init []
  (clerk/initialize!)
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (let [match (reitit/match-by-path router path)
            current-page (:name (:data  match))
            route-params (:path-params match)]
        (reagent/after-render clerk/after-render!)
        (session/put! :route {:current-page (page-for current-page)
                              :route-params route-params})
        (clerk/navigate-page! path)))
        
    :path-exists?
    (fn [path]
      (boolean (reitit/match-by-path router path)))})
  (accountant/dispatch-current!)
  (mount-root))
