(ns maybe-sheep.pages.misc
  (:require [maybe-sheep.pages.misc-content :refer [misc-items]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.flex.flex-column.justify-center.bg-image-3
     [:div.flex.flex-row.bb.b--near-white.bw2 
      [:section.f-subheadline.w-100.h4.tc.sub-m.bg-near-black.near-white.ma1.bw1.b--near-white.ba "Things that interest me"]]
     [:div.vh-100.flex.flex-column.flex-wrap.justify-around.w-100.self-center.overflow-scroll
      (for [item misc-items]
       [:div.h-30.grow.bw2.shadow-3.ma3.bg-black-60.flex.flex-column.ba.bw2.b--near-white
        [:section.f3.avenir.sub-m.tc.b--light-gray.truncate.near-white.w-auto.bb.bw1.b--dark-pink (item :title)]
        [:a.no-underline.avenir.near-white.hover-animate.grow.hover-moon-gray.self-center.f3 {:href (item :link)} "Link"]   
        [:div.f3.w-20.tc.self-center.near-white.avenir.mb1 "Tags:"]
        [:div.f2.bw1.avenir.w-100.flex.flex-row.bg-black-10.ba.bw1.b--near-white
         (for [tag (:tags item)]
          [:span.ma1.f5.pa2.shadow-1.tc.w-33 {:class (cond 
                                     (= tag "application") "bg-washed-red"
                                     (= tag "minimalist")  "bg-washed-green"
                                     (= tag "art") "bg-washed-blue"
                                     (= tag "dec/dist") "bg-washed-yellow"
                                     (= tag "site") "c4"
                                     (= tag "language") "c5"
                                     (= tag "music") "c6"
                                     :else "bg-moon-gray")} tag])]])]])