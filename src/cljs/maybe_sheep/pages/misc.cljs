(ns maybe-sheep.pages.misc
  (:require [maybe-sheep.pages.misc-content :refer [misc-items]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.flex.flex-column.justify-center
     [:section.f1.bb.b--black.bw2.w-100.h4.tc.sub-m "Things that interest me"]
     [:div.vh-100.flex.flex-row.flex-wrap.justify-between.w-100.self-center
      (for [item misc-items]
       [:div.h-30.grow.ba.bw1.b--black.bw2.shadow-3.w-33.mt1.mb1
        [:section.f2.avenir.sub-m.tc.ba.bw2.b--light-gray.truncate (item :title)]
        [:div.pa2.f2.bw1.avenir.w-100.flex.flex-column
          [:div.f4.w-20.tc.self-center "Tags"]
         (for [tag (:tags item)]
          [:span.ma1.f5.pa2.ba.bw1.b--black.shadow-1.tc.w-auto {:class (cond 
                                     (= tag "application") "bg-washed-red"
                                     (= tag "minimalist")  "bg-washed-green"
                                     (= tag "art") "bg-washed-blue"
                                     (= tag "dec/dist") "bg-washed-yellow"
                                     :else "bg-moon-gray")} tag])
          [:a.no-underline.avenir.near-black.hover-animate.grow.hover-moon-gray.self-center {:href (item :link)} "Link"]]])]])