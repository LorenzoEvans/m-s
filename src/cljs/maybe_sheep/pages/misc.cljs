(ns maybe-sheep.pages.misc)

(defn misc-page []
  [:div.flex.flex-column.w-75.bg-near-black.bl.bw2.bt.b--dark-pink.overflow-scroll
   [:blockquote.fw5.avenir.f2.washed-green "A list of things I like"]
   [:ul.flex.flex-column.w-75.justify-center 
    [:li.bg-washed-green.w-25.tc.grow.hover-bg-near-black [:span [:a.f3.fw5.avenir.navy.hover-near-white.tracked-mega {:href "urbit.org"} "Urbit"]]]
    [:li.bg-washed-green.w-25.tc.grow.hover-bg-near-black [:span [:a.f3.fw5.avenir.navy.hover-near-white.tracked-mega {:href "urbit.org"} "Brutalist Web Design"]]]

    ]])