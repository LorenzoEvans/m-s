(ns maybe-sheep.pages.posts
  (:require 
   [maybe-sheep.articles.article-content :refer [content-store]]
   [maybe-sheep.routing :refer [path-for]]))

(def content-list (get-in content-store [:content]))

(def current-post (atom {:current-post nil}))

@current-post

(defn posts-page []
  (fn []
    [:span.w-75.flex.flex-column.justify-evenly.overflow-scroll.content-center.items-center.bw2.b--black
     [:h1.w5.tc.avenir "Maybe Posts"]
     (for [item content-list]
       (let [kw (first item)
             {:keys [title url prev]} (second item)]
         ^{:key kw}
         [:div.w-100.flex.flex-row.justify-center.ma2
          [:ul 
           (map
            (fn [item-id]
             [:li 
               [:a.avenir.link.dim.navy.truncate {:href (path-for :item {:item-id item-id})}
                                            title]]) (range (count content-list)))]]))]))
