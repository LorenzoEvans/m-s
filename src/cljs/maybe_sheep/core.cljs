(ns maybe-sheep.core
  (:require
   [maybe-sheep.layout :refer [home-page
                               posts-page
                               post-page
                               about-page]]
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

(js/console.log (count content-list))

;; -------------------------
;; Translate routes -> page components

(defn page-for [route]
  (case route
    :index #'home-page
    :about #'about-page
    :posts #'posts-page
    :post #'post-page))


(def current-post
  (atom {:current-post nil}))


@current-post

;; -------------------------
;; Page mounting component

(defn current-page []
  (fn []
    (let [page (:current-page (session/get :route))]
      [:div.moon-gray.vh-100.flex.flex-row.justify-between.bg-image..w-100
       [:div.flex.flex-column.justify-around.vh-100
        [:span.ma3.bb.bw2.b--dark-gray [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :index)} "Home"]]
        [:span.ma3.bb.bw2.b--dark-gray [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :about)} "About"]]
        [:span.ma3.bb.bw2.b--dark-gray [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :posts)} "Posts"]]]
       [page]
       [:div.flex.flex-column.w-33
        (for [item (take-last 3 (shuffle content-list))]   
          (let [title (:title (second item))
                url  (:url (second item))
                prev (:prev (second item))]
            ^{:key (first item)} 
            [:section.pa2.light-gray.bt.b--near-white.bw2.avenir.vh-100
             [:div.flex.flex-column-reverse
              [:article.fl.dib-ns.w-100.ba.br2.b--dark-gray.bg-near-black.bw2.light-gray
               [:h4.f4-l.fw4.light-gray.pa1.w3.truncate title]
               [:span.f7.f6-l.dib-ns.light-gray.pa2 "Larkin St"]
               [:span.f7.f6-l.light-gray.pa2 "San Fran, Ca, zipcode"]
               [:a.f6.dib-ns.fw6.pa2.pv3.light-gray.pa2.link.dim {:href (path-for :post {:post-id url})
                                                                  :on-click #(swap! current-post assoc :current-post (first item))} "Read"]]]]))]])))

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
