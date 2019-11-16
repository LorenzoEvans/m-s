(ns maybe-sheep.core
  (:require
   [maybe-sheep.layout :refer [home-page
                               posts-page
                               post-page
                               about-page
                               current-post]]
   [maybe-sheep.routing :refer [path-for router]]
   [reagent.core :as reagent :refer [atom]]
   [reagent.session :as session]
   [reitit.frontend :as reitit]
   [clerk.core :as clerk]
   [maybe-sheep.layout :refer [content-list]]
   [accountant.core :as accountant]))

;; -------------------------
;; Routes


;; -------------------------
;; Page components


;; -------------------------
;; Translate routes -> page components

(defn page-for [route]
  (case route
    :index #'home-page
    :about #'about-page
    :posts #'posts-page
    :post #'post-page))


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
        [:span.ma3.br.bb.br1.b--near-black.bw2.pa4.bn-m [:a.w-100.grow.no-underline.avenir.bw1.navy.f2.bg-near-white.black.bg-animate.hover-bg-black.hover-white.items-center.pa3.ba.br1.ma4.b--dark-gray {:href (path-for :index)} "Home"]]
        [:span.ma3.br.bb.br1.b--near-black.bw2.pa4.bn-m [:a.w-100.grow.no-underline.avenir.bw1.navy.f2.bg-near-white.black.bg-animate.hover-bg-black.hover-white.items-center.pa3.ba.br1.ma4.b--dark-gray {:href (path-for :about)} "About"]]
        [:span.ma3.br.bb.br1.b--near-black.bw2.pa4.bn-m [:a.w-100.grow.no-underline.avenir.bw1.navy.f2.bg-near-white.black.bg-animate.hover-bg-black.hover-white.items-center.pa3.ba.br1.ma4.b--dark-gray {:href (path-for :posts)} "Posts!"]]
        [:span.ma3.br.bb.br1.b--near-black.bw2.pa4.bn-m [:a.w-100.grow.no-underline.avenir.bw1.navy.f2.bg-near-white.black.bg-animate.hover-bg-black.hover-white.items-center.pa3.ba.br1.ma4.b--dark-gray {:href (path-for :posts)} "Misc!"]]
        ]
       [page]])))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
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
        (clerk/navigate-page! path)
        ))
    :path-exists?
    (fn [path]
      (boolean (reitit/match-by-path router path)))})
  (accountant/dispatch-current!)
  (mount-root))
