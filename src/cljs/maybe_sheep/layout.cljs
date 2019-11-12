(ns maybe-sheep.layout
  (:require [maybe-sheep.routing :refer [path-for]]
            [reagent.session :as session]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(path-for :about)
(path-for :posts)
(path-for :post)

(defn home-page []
  (fn []
    [:span.bg-washed-green
     [:h1.avenir.washed-red "Welcome to maybe-sheep"]
     [:ul
      [:li [:a {:href (path-for :posts)} "Posts"]]
      [:li [:a {:href "/broken/link"} "Broken link"]]]]))


(def content-list (get-in content-store [:content]))

(def current-post
  (atom {:current-post nil}))


@current-post

(defn posts-page []
  (fn []
    [:span.main
     [:h1 "Maybe Posts"]
     (for [item content-list]
       (let [kw (first item)
             {:keys [title url prev]} (second item)]
         ^{:key kw}
         [:div
          [:div title]
          [:a {:href (path-for :post {:post-id url})
               :on-click #(swap! current-post assoc :current-post kw)} "Read"]]))]))


(defn post-page []
  (fn []
    [:div 
       (let [cp @current-post
             title (get-in content-list [(:current-post cp) :title])
             prev (get-in content-list [(:current-post cp) :prev])
             full-article (get-in content-list [(:current-post cp) :full-article])
             ]
         [:span.main
          [:h1 title]
          [:div prev]
          [:div full-article]
          [:p [:a {:href (path-for :posts)} "Back to the list of items"]]])]))


(defn about-page []
  (fn [] [:span.main
          [:h1 "About maybe-sheep"]]))