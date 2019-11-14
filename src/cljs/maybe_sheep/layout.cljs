(ns maybe-sheep.layout
  (:require [maybe-sheep.routing :refer [path-for]]
            [reagent.session :as session]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(path-for :about)
(path-for :posts)
(path-for :post)

(defn home-page []
  (fn []
    [:div.w-75.flex.flex-column.justify-center.w-80-m.flex-column-m.justify-around-m
     [:nav.flex.flex-row.justify-between.w-100.h2.flex-column-m.h-20
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1 {:href "https://github.com/LorenzoEvans"} "Github"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1 {:href "#"} "Twitter"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1 {:href "#"} "Portfolio"]
      ]
     [:div.flex.flex-column.overflow-x-scroll-m
      [:h1.avenir.dark-gray.f-subheadline.tc.ba.b--near-black.bw2.mb2.self-center.mr4.shadow-3.f2-m.ph4-ns.pa4.hover-bg-dark-gray.hover-near-white.hover-animate.hover-near-black.grow.bg-animate "Maybe Sheeps"]
      [:div.flex.flex-column.bg-near-white.br3.bw2.ba.b--near-black.w-50.tc.avenir.navy.f4.pa3.lh-copy.fw2.h-60.self-center.w-75-m.shadow-3.dn-m
       [:div.fw3.bb.bt.bw1.ma2.b--near-black. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
       [:div.fw3.bb.bw1.ma2.b--near-black "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
       [:div.f5.fw1.ba.bw1.ma2.b--near-black "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state" 
        [:div.f5.fw1.ba.bw1.ma2.b--near-black " * may contain non-tech related things because this is my blog and my code is law here. "]]]]]))


(def content-list (get-in content-store [:content]))

(def current-post (atom {:current-post nil}))

@current-post

(defn posts-page []
  (fn []
    [:span.w-75.flex.flex-column.justify-around.overflow-scroll.content-center.items-center.bw2.b--black
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
          (js/console.log title)
          [:h1.avenir title]
          [:div prev]
          [:div.flex.justify-center.article-height full-article]
          [:p [:a.avenir.link.dim.navy {:href (path-for :posts)} "Back to the list of items"]]])]))


(defn about-page []
  (fn [] [:span.w-75
          [:h1.f-subheadline.avenir.dim.hover-animate.hover-bg-dark-red.hover-navy "I'm not quite sure what this blog is about."]
          [:span.f1.avenir.shadow-3.b--light-blue.bg-near-black.hover-animate.grow.glow.hover-purple.lh-copy.bg-light-green.navy.hover-bg-near-white "I suppose you, the reader, would be a better judge of that than I."]
          [:p.avenir.dim.hover-animate.hover-bg-dark-blue.hover-washed-blue.bg-purple.w-25.br3.pa2 "I can't promise I will update this regularly."]
          [:p.avenir.grow.hover-animate.hover-near-white.hover-dark-blue.bg-near-white.w-25.br3.pa2.dark-pink "Safe to say this blog is asynchronous."]
          ]))