(ns maybe-sheep.pages.posts
  (:require 
   [maybe-sheep.articles.article-content :refer [content-store]]
   [maybe-sheep.pages.homepage :refer [link-styling-x]]))

(def content-list (get-in content-store [:content]))

(defn posts-page []
  (fn []
      [:span.w-100.flex.flex-column.justify-center.overflow-scroll.content-center.items-center.bw2.b--black.bg-image-2.vh-100
          [:h1.w-100.tc.avenir.bw2.avenir.moon-gray.f1.b--near-black.bw1.f2-m.tc.self-center.flex.flex-column.justify-center "Maybe Posts"
              (for [item content-list]
                  (let [kw (first item) {:keys [title url prev]} (second item)]
                          ^{:key kw}
                          [:div.w-90.flex.flex-row.justify-center.ma2.shadow-3.ba.bw2.f3.bg-near-black.self-center
                           [:a.avenir.link.dim.near-white.truncate {:href url} title]]))]
            [:a.avenir {:class link-styling-x :href "#/"} "Home"]]))