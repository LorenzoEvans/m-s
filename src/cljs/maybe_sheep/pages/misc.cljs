(ns maybe-sheep.pages.misc
  (:require [maybe-sheep.pages.misc-content :refer [misc-items]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.flex.flex-column.justify-center
     [:div.flex.flex-row.bb.b--black.bw2 
      [:section.f1.w-40.h4.tc.sub-m.bg-near-black.near-white.ma1.bw1.b--near-white.ba "Things that interest me"]]
     [:div.vh-100.flex.flex-column.flex-wrap.w-100.self-center
      (for [item misc-items]
       [:div.h-30.grow.ba.bw1.b--black.bw2.shadow-3.w-33.ma1
        [:section.f2.avenir.sub-m.tc.ba.bw2.b--light-gray.truncate (item :title)]
        [:div.pa2.f2.bw1.avenir.w-100.flex.flex-column
          [:div.f4.w-20.tc.self-center "Tags"]
         (for [tag (:tags item)]
          [:span.ma1.f5.pa2.ba.bw1.b--black.shadow-1.tc.w-auto {:class (cond 
                                     (= tag "application") "bg-washed-red"
                                     (= tag "minimalist")  "bg-washed-green"
                                     (= tag "art") "bg-washed-blue"
                                     (= tag "dec/dist") "bg-washed-yellow"
                                     (= tag "site") "c4"
                                     (= tag "language") "c5"
                                     (= tag "music") "c6"
                                     :else "bg-moon-gray")} tag])
          [:a.no-underline.avenir.near-black.hover-animate.grow.hover-moon-gray.self-center {:href (item :link)} "Link"]]])]])