  
(ns maybe-sheep.pages.homepage
  (:require [maybe-sheep.subs]))

(defn new-string [x]
  (clojure.string/replace x "." " "))

(def link-styling-home (new-string "h3.pa1.grow.bw1.w-90.f3.near-black.bg-near-white.w4.w-75-m.hover-bg-dark-gray.bb.bw3.br1.hover-washed-green.b--near-black.shadow-3.flex.items-center.justify-center"))
(def link-styling-x (new-string "h3.pa1.grow.bw1.w-40.ma1.f3.near-black.bg-near-white.w4.w-75-m.hover-bg-dark-gray.bb.bw3.br1.hover-washed-green.b--near-black.shadow-3.flex.items-center.justify-center"))

(defn github-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "https://github.com/LorenzoEvans"} "Github"])
(defn twitter-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "https://twitter.com/0xLEDev"} "Twitter"])
(defn posts-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/posts"} "Posts"])
(defn misc-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/misc"} "Misc"])
(defn arena-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "https://www.are.na/bilnub-bollyx"} "Are.na"])
(defn about-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/about"} "About"])
(defn portfolio-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "http://www.lorenzoevans.me/"} "Portfolio"])


(def outer-home-page (new-string "flex.flex-row.flex-column-m.justify-around-m.b--near-black.bw2.bg-near-black.vh-100.mono-gf.bg-image.items-center"))
(def home-page-nav (new-string "w-30.items-center.flex.flex-column.justify-around.self-center.mt2.mb2.flex-column-m.justify-between-m.h-100-m.ma2.vh-75"))
(def outer-title (new-string "w-100.bg-image-6.tracked-mega.h3-m.bg-near-white.flex.flex-column.content-center.mt4"))
(def title-synths (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.light-blue"))
(def title-for (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.hot-pink"))
(def title-compilers (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.navy"))
(defn home-page []
(fn []
  [:div {:class outer-home-page}
   [:nav {:class home-page-nav}
    [posts-anchor]
    [portfolio-anchor]
    [github-anchor]
    [twitter-anchor]
    [about-anchor]
    [misc-anchor]
    [arena-anchor]]
   [:div#p-gram {:class outer-title}
    [:span#n-skew {:class title-synths} "s[Y]nths"] 
    [:span#n-skew {:class title-for} "f0r"] 
    [:span#n-skew {:class title-compilers} "comp[I]lers"]]]))