(ns maybe-sheep.layout
  (:require [maybe-sheep.routing :refer [path-for]]
            [reagent.session :as session]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(path-for :about)
(path-for :posts)
(path-for :post)
(path-for :misc)

(defn home-page []
  (fn []
    [:div.w-75.flex.flex-column.justify-around.w-80-m.flex-column-m.justify-around-m.b--near-black.bw2
     [:nav.flex.flex-row.w-100.h5.flex-column-m.h-20.items-center
      [:h1.flex.flex-column.justify-center.w-75.ml1.w-90-m.flex-column-m.bw2.avenir.dark-gray.f-subheadline.ba.b--near-black.bw2.mb2.mr4.shadow-3.f2-m.hover-bg-dark-gray.hover-near-white.hover-animate.hover-near-black.grow.bg-animate.tc.self-center.dn-m "Maybe Sheeps"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "https://github.com/LorenzoEvans"} "Github"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "https://twitter.com/0xLEDev"} "Twitter"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "https://ledev-site.herokuapp.com/"} "Portfolio"]]
     [:div.flex.flex-column.bg-near-white.br3.bw2.ba.b--near-black.w-50.tc.avenir.navy.f4.pa3.lh-copy.fw2.h-60.self-center.w-75-m.shadow-3.dn-m
      [:div.fw3.bb.bt.bw1.ma2.b--near-black. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
      [:div.fw3.bb.bw1.ma2.b--near-black "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
      [:div.f5.fw1.ba.bw1.ma2.b--near-black "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"
       [:div.f5.fw1.ba.bw1.ma2.b--near-black " * may contain non-tech related things because this is my blog and my code is law here. "]]]]))
; hover-bg-dark-gray.hover-near-white.hover-animate.hover-near-black.grow.bg-animate.tc

(def content-list (get-in content-store [:content]))

(def current-post (atom {:current-post nil}))

@current-post


(defn post-page []
  (fn []
    [:div.w-75 
       (let [cp @current-post
             title (get-in content-list [(:current-post cp) :title])
             prev (get-in content-list [(:current-post cp) :prev])
             full-article (get-in content-list [(:current-post cp) :full-article])]
             
         [:span.flex.flex-column.justify-between.content-center.items-center.h-100.overflow-scroll
          (js/console.log title)
          [:h1.avenir title]
          [:div.avenir.near-black prev]
          [:div.flex.justify-center.article-height full-article]
          [:p [:a.avenir.link.dim.navy {:href (path-for :posts)} "Back to the list of items"]]])]))


