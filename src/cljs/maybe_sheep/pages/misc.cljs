(ns maybe-sheep.pages.misc
  (:require [maybe-sheep.pages.misc-content :refer [misc-items]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.flex.flex-column.justify-center
     [:section.f1.bb.b--black.bw2.w-100.h4.tc.sub-m "Things that interest me"]
     [:div.vh-100.flex.flex-column.flex-wrap.justify-around
      (for [item misc-items]
       [:div.grow.ma2.ba.bw1.b--black.bw2.shadow-3
        [:section.f2.avenir.sub-m.tc.ba.bw2.b--light-gray (item :title)]
        [:div.pa2.f2.bw1.avenir.w-100.flex.flex-column
         [:a.no-underline.avenir.near-black.hover-animate.grow.hover-navy.self-center {:href (item :link)} "Link"]
          [:div.f4.w-20.tc.self-center "Tags"]
         (for [tag (:tags item)]
          [:span.ma1.f5.pa2.ba.bw1.b--black.shadow-3.tc.w-auto {:class (cond 
                                     (= tag "application") "bg-washed-red"
                                     (= tag "minimalist")  "bg-washed-green"
                                     (= tag "art") "bg-washed-blue"
                                     :else "bg-moon-gray")} tag])
          ]])]])