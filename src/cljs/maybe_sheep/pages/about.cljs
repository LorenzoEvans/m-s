(ns maybe-sheep.pages.about)

(defn about-page []
  (fn [] [:span.w-75.bw2.b--near-black.overflow-scroll.flex.flex-column.justify-around
          [:h1.f2.avenir.grow.ml1.f3-m.w-75.tc.pa2 "I'm Lorenzo Evans, a developer, musician, writer, thinker and creative."
           [:h1.f4.avenir.hover-animate.hover-bg-dark-red.hover-navy.ml1.f3-m.pa2 "I recently finished the "
            [:span.hover-bg-dark-red.hover-animate.hover-washed-yellow [:a.f4.avenir.near-black.hover-washed-yellow {:href "https://lambdaschool.com/courses/full-stack-web-development"} "Lambda School Fullstack Web Development track."]]]
           [:div.flex.flex-row.flex-wrap.justify-center.hover-animate
            [:span.f3.avenir.shadow-3.b--light-blue.pa3.ml1.bg-near-black.hover-animate.grow.glow.hover-purple.w-50.lh-copy.bg-light-green.navy.hover-bg-near-white.f3-m.w-60.tc "Here's the deal:"]
            [:p.ma2.avenir.dim.hover-animate.hover-bg-dark-blue.ml1.hover-washed-blue.bg-purple.w-40.br3.pa2.w-50-m "I can't promise I will update this regularly."]
            [:p.ma2.avenir.grow.hover-animate.hover-near-white.ml1.hover-dark-blue.bg-near-white.w-40.br3.pa2.dark-pink.w-50-m "(It's safe to say this blog is asynchronous.)"]
            [:p.ma2.avenir.grow.hover-animate.hover-light-green.ml1.hover-bg-near-black.bg-near-white.w-60.br3.pa2.dark-pink.w-50-m "But I will try and make reading it worth your time!"]
            ]]
          ]))