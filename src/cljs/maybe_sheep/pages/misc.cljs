(ns maybe-sheep.pages.misc
  (:require [maybe-sheep.pages.misc-content :refer [misc-items]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.pa2
     [:section.f1.avenir "Things that interest me"]
     [:div.vh-100.flex.flex-column.flex-wrap.justify-evenly 
      (for [item misc-items]
       [:div.h-30.w-auto.pa2.grow.db.ma2.ba.bw1.b--black {:class (:bg item)}
        [:section.f2.avenir.w-50 (item :title)]
        [:section.pa2.tc (item :type)]
        [:a.no-underline.avenir {:class link-styling-x :href (item :link)} (item :title)]
        [:blockquote.pa2.f2.bw1.avenir.w-auto 
          [:div.f4.w-20 "Tags"]
         (for [tag (:tags item)]
          [:span.ma1.f5.pa2.ba.bw1.b--black.shadow-3.flex.flex-row.flex-wrap.tc {:class (cond 
                                     (= tag "application") "bg-washed-red"
                                     (= tag "minimalist")  "bg-washed-green"
                                     (= tag "art") "bg-washed-blue"
                                     :else "bg-moon-gray")} tag])]])]])