(ns app-sheeps.views
  (:require
   [re-frame.core :as re-frame]
   [app-sheeps.subs :as subs]
   [app-sheeps.pages.homepage :refer [home-page]]
   [app-sheeps.pages.about :refer [about-page]]
   [app-sheeps.pages.posts :refer [posts-page]]
   [app-sheeps.pages.misc :refer [misc-page]]
   [app-sheeps.articles.article-data :refer [how-fp hoon-school-week-1]]
   ))


;; home
;; about

(defn about-panel []
  [:div
   [:h1 "This is the About Page."]

   [:div
    [:a {:href "#/"}
     "go to Home Page"]]])

;; main

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-page]
    :about-panel [about-page]
    :posts-panel [posts-page]
    :how-fp-panel [how-fp]
    :misc-panel [misc-page]
    :hoon-school-week-1-panel [hoon-school-week-1]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))