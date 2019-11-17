(ns maybe-sheep.pages.about)

(defn about-page []
  (fn [] [:span.w-75.bw2.b--near-black.overflow-scroll
          [:h1.f-subheadline.avenir.dim.hover-animate.hover-bg-dark-red.hover-navy.ml1.f3-m "I'm not quite sure what this blog is about."]
          [:span.f1.avenir.shadow-3.b--light-blue.ml1.bg-near-black.hover-animate.grow.glow.hover-purple.lh-copy.bg-light-green.navy.hover-bg-near-white.f3-m "I suppose you, the reader, would be a better judge of that than I."]
          [:p.avenir.dim.hover-animate.hover-bg-dark-blue.ml1.hover-washed-blue.bg-purple.w-25.br3.pa2.w-50-m "I can't promise I will update this regularly."]
          [:p.avenir.grow.hover-animate.hover-near-white.ml1.hover-dark-blue.bg-near-white.w-25.br3.pa2.dark-pink.w-50-m "Safe to say this blog is asynchronous."]]))