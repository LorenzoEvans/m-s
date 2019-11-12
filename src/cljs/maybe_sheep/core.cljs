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


;; -------------------------
;; Page mounting component

(defn current-page []
  (fn []
    (let [page (:current-page (session/get :route))]
      [:div.moon-gray.vh-100.vw-100.ba.bw1.flex.flex-row.justify-between.bg-image
            [:div.flex.flex-column.justify-around
             [:span.ma1 [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :index)} "Home"]]
             [:span.ma1 [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :about)} "About"]]
             [:span.ma1 [:a.grow.no-underline.avenir.navy.f2.hover-gray.dim {:href (path-for :posts)} "Posts"]]]
       [page]
       [:section.pa3.pa3-l.black-70.bt.b--black-10.avenir.flex.flex-column.w-25.justify-center
        [:div.mb4-l.flex.justify-center
         [:div.flex.flex-column.flex-wrap.justify-around
          [:h1.f6.fw6.mb4 "Studios"]
          [:article.fl.w-50.dib-ns.w-auto-ns.mr3-m.mr4-l.mb3.pr2.pr0-ns
           [:h4.f5.f4-l.fw6 "SF"]
           [:span.f7.f6-l.db.black-70 "Larkin St"]
           [:span.f7.f6-l.black-70 "San Fran, Ca, zipcode"]
           [:a.f6.db.fw6.pv3.black-70.link.dim "A link here"]]
          [:article.fl.w-50.dib-ns.w-auto-ns.mr3-m.mr4-l.mb3.pr2.pr0-ns
           [:h4.f5.f4-l.fw6 "SF"]
           [:span.f7.f6-l.db.black-70 "Larkin St"]
           [:span.f7.f6-l.black-70 "San Fran, Ca, zipcode"]
           [:a.f6.db.fw6.pv3.black-70.link.dim "A link here"]]
          [:article.fl.w-50.dib-ns.w-auto-ns.mr3-m.mr4-l.mb3.pr2.pr0-ns
           [:h4.f5.f4-l.fw6 "SF"]
           [:span.f7.f6-l.db.black-70 "Larkin St"]
           [:span.f7.f6-l.black-70 "San Fran, Ca, zipcode"]
           [:a.f6.db.fw6.pv3.black-70.link.dim "A link here"]]]]]])))

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
