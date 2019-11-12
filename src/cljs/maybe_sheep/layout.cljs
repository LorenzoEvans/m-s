(ns maybe-sheep.layout
  (:require [maybe-sheep.routing :refer [path-for]]
            [reagent.session :as session]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(path-for :about)
(path-for :posts)
(path-for :post)

(defn home-page []
  (fn []
    [:div.w-75.bl.br.b--black.bw2
     [:h1.avenir.navy.f2.tc "Maybe Sheep"]]))


(def content-list (get-in content-store [:content]))

(def current-post
  (atom {:current-post nil}))


@current-post

(defn posts-page []
  (fn []
    [:span.w-75.flex.flex-column.justify-around.overflow-scroll.content-center.items-center.bl.br.bw2.b--black
     [:h1.w5.tc.avenir "Maybe Posts"]
     (for [item content-list]
       (let [kw (first item)
             {:keys [title url prev]} (second item)]
         ^{:key kw}
         [:div.w-100.flex.flex-row.justify-center
          [:a.avenir.link.dim.navy {:href (path-for :post {:post-id url})
               :on-click #(swap! current-post assoc :current-post kw)} title]]))]))


(defn post-page []
  (fn []
    [:div.w-75 
       (let [cp @current-post
             title (get-in content-list [(:current-post cp) :title])
             prev (get-in content-list [(:current-post cp) :prev])
             full-article (get-in content-list [(:current-post cp) :full-article])
             ]
         [:span.flex.flex-column.justify-center.content-center.items-center
          [:h1.avenir title]
          [:div prev]
          [:div.flex.justify-center.article-height full-article]
          [:p [:a.avenir.link.dim.navy {:href (path-for :posts)} "Back to the list of items"]]])]))


(defn about-page []
  (fn [] [:span.w-75
          [:h1 "About maybe-sheep"]]))