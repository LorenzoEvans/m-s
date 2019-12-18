(ns maybe-sheep.styles)

(defn new-string [x]
    (clojure.string/replace x "." " "))

(def current-page-buttons (new-string "w-100.grow.no-underline.avenir.bw1.navy.f2.bg-near-white.black.bg-animate.hover-bg-black.hover-white.items-center.pa3.ba.br1.ma4.b--dark-gray"))
(def current-page-buttons-container (new-string "ma3.br.bb.br1.b--near-black.bw2.pa4.bn-m"))