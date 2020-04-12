  
(ns maybe-sheep.pages.homepage
  (:require [maybe-sheep.subs]
            [maybe-sheep.styles :as styles]))


  (defn github-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "https://github.com/LorenzoEvans"} "Github"])
  (defn twitter-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "https://twitter.com/0xLEDev"} "Twitter"])
  (defn posts-anchor [] [:a.w-100.mono-gf.glow.tc {:class styles/link-styling-home :href "#/posts"} "Maybe Posts"])
  (defn misc-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "#/misc"} "Misc"])
  (defn arena-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "https://www.are.na/bilnub-bollyx"} "Are.na"])
  (defn about-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "#/about"} "About"])
  (defn portfolio-anchor [] [:a.w-100.mono-gf.glow {:class styles/link-styling-home :href "http://www.lorenzoevans.me/"} "Portfolio"])
(defn home-page []
  (fn []
    [:div {:class styles/outer-home-page}
    [:nav {:class styles/home-page-nav}
      [posts-anchor]
      [portfolio-anchor]
      [github-anchor]
      [twitter-anchor]
      [about-anchor]
      [misc-anchor]
      [arena-anchor]]
    [:div#p-gram {:class styles/outer-title}
      [:span#n-skew.hover-washed-green {:class styles/title-synths} "s[Y]nths"] 
      [:span#n-skew.hover-navy {:class styles/title-for} "f0r"] 
      [:span#n-skew.hover-washed-yellow {:class styles/title-compilers} "comp[I]lers"]]]))