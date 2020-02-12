(ns maybe-sheep.views
  (:require
   [re-frame.core :as re-frame]
   [maybe-sheep.subs :as subs]
   [maybe-sheep.pages.homepage :refer [home-page]]
   [maybe-sheep.pages.about :refer [about-page]]
   [maybe-sheep.pages.posts :refer [posts-page]]
   [maybe-sheep.pages.misc :refer [misc-page]]
   [maybe-sheep.articles.how-fp :refer [how-fp]]
   [maybe-sheep.articles.how-code :refer [how-code]]
   [maybe-sheep.articles.why-hard :refer [why-hard]]
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
    :how-code-panel [how-code]
    :how-fp-panel [how-fp]
    :misc-panel [misc-page]
    :why-hard-panel [why-hard]
    :hoon-school-week-1-panel [hoon-school-week-1]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))