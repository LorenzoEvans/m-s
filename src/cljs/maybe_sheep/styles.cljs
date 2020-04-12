(ns maybe-sheep.styles)

(defn new-string [x]
  (clojure.string/replace x "." " "))

(def link-styling-home (new-string "w-100.pa1.h-100.grow.bw1.f3.bg-moon-gray.w-75-m.hover-bg-dark-gray.bw1.b--near-black.flex.items-center.moon-gray.justify-center.glow.shadow-3.c1.hover-animate.bg-animate.hover-washed-red.hover-bg-near-white.background.o-90.hvr-bob.tracked.ttu"))
(def link-styling-x (new-string "pa2.grow.bw1.w-40.ma1.f3.near-black.bg-near-white.w4.w-75-m.hover-bg-dark-gray.bb.bw3.br1.hover-washed-green.b--near-black.shadow-3.flex.items-center.justify-center"))




(def outer-home-page (new-string "flex.flex-column.flex-column-m.justify-between.justify-around-m.b--near-black.bw2.bg-near-black.vh-100.mono-gf.bg-image.items-center"))
(def home-page-nav (new-string "w-100.items-center.flex.flex-row.justify-between.self-center.mb2.flex-column-m.justify-between-m.vh-100-m.vh-25.bt.bw3.b--washed-red.shadow3.h-100.bg-washed-red.bb"))
(def outer-title (new-string "w-100.bg-image-6.tracked-mega.h3-m.bg-near-white.flex.flex-column.content-center.mb4"))
(def title-synths (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.light-blue"))
(def title-for (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.hot-pink"))
(def title-compilers (new-string ".m-sub.f1.tracked-mega.f2-m.fw1.self-center.near-white.bb.bw1.b--moon-gray.navy"))