(ns maybe-sheep.articles.why-hard
  (:require [maybe-sheep.articles.article-data :refer [posts-anchor portfolio-anchor]]
    github-anchor twitter-anchor
    about-anchor misc-anchor))

(defn why-hard []
  [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
   [:section.flex.flex-row.justify-between.w-100]
   [posts-anchor]
   [portfolio-anchor]
   [github-anchor]
   [twitter-anchor]
   [about-anchor]
   [misc-anchor]
   [:section.flex.flex-column.h-75.w-75
  
    [:p.f3.fw6.navy.bb.bw2 "Why Programming Is Hard"]
    [:div.lh-copy
     [:p.lh-copy.pt1.pb1.near-black] 
     "TIn my journey as a software developer, I’ve learned that, surprise surprise, learning how to program (well), is very difficult, in a way that I don’t quite believe many other things are, and began to get very curious about why this difficulty is so unique. I’ve noticed that the reputation of the difficulty of programming preceeds it, and leads some people to preclude it as a skill, hobby, or past-time that they can pick up, and become competent at." 
     [:p.lh-copy.pt1.pb1.near-black "I’ve tried to pitch programming to a few friends, mostly mechanics and audio-engineers, given that their current hobby is at least technical enough (seriously, properly mixing layered audio so that the low end of an 808 doesn’t distort a particularly thick synth pad is no joke), that I felt they wouldn’t have as much of a problem transitioning into this field, as people who’ve never dealt with anything technical, mechanical, electronic, etc, or perhaps aren’t innately inclined towards those things."] 
     [:p.lh-copy.pt1.pb1.near-black " I’m in my 8th month at Lambda School, and it has been a riveting, exhilarating, emotional journey, and many times, has put me face to face with challening concepts, tasks, and questions."]
     [:p.lh-copy.pt1.pb1.near-black "That being said, given some elbow grease, patience, combined with utilizing the wealth of knowledge available in terms of the training kit, the PM’s, fellow students and instructors, I have yet to come face to face with something in programming that I can’t learn. At this point, actually, I simply don’t believe it exists. Not for me, you, or anyone else. The question I’ve been trying to answer is, what are the barriers, that have kept people (and even me, prior to 2017), away from programming?"]
     [:blockquote.f1.bg-animate.hover-animate.hover-bg-near-black.hover-purple.pa1.moon-gray "In my personal, and humble opinion, I believe the following four things, in no particular order, are the main culprits behind people’s lack of self belief with regards to them becoming a programmer:"]
     [:p.lh-copy.pt1.pb1.near-black "There was more, but these few lines of code were enough to seduce me, and I immediately had to find out what it was. As you've probably guessed by now, it was Haskell, which happens to be a strictly typed, purely functional, and extremely unique language. It was love at first sight. I started learning me a Haskell for great good. I was intoxicated. I could not believe how useful list comprehensions were, how clean guards looked as conditional branches, or how powerful function composition was, but there was something else that really sealed my resolve to become a functional programmer:"]
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-100.tc.tracked-mega "T Y P E S I G N A T U R E S"]
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-100.tc "inc :: Num a => a -> a"
      [:hr.w-50.bb.bw2.b--navy]
      [:div.fw1 "(the function inc is of type Num a, meaning it can accept any value so long as it is of the Num typeclass, as it expects one of those values, and will also return one. )"]]
     [:p.lh-copy.pt1.pb1.near-black "The number of hours lost that would have been saved if I had've been able to express to my compiler the nature, the type I expected a function to be working with, and what order, at every stage of it's execution are too great, to many. There was freedom in this strictness. I was free to define as strictly as I pleased, or as loosely I as pleased, the aforementioned criteria of a function. It was then that I resolved to become a Haskeller, and began studying the language, and all things functional programming, and quickly, two things happened: I realized I had fallen into a rabbit-hole, and that there were things way, way stranger than JavaScript that awaited me on this path."]
     [:p.lh-copy.pt1.pb1.near-black "What I didn't realize, at the time, was that my stay at Hotel Haskell, was going to be much shorter than I intended it to be."]
     [:div.lh-copy.pt1.pb1.near-black "I was yet to reach my actual destination."]
     [:div.lh-copy.pt1.pb1.near-black "Where was the next stop?"]
     [:div.lh-copy.pt1.pb1.near-black "The answer involves the inspiration behind Haskell's list data structure, which, for a data structure that seemed quite normal, that I had such a long standing relationship with,
      having used lists in HTML, I couldn't have imagined the complexity that underlay this implementation of that data structure, and even more so, I couldn't imagine the simplicity."]
     [:div.lh-copy.pt1.pb1.near-black "The day programming introduced me to Haskell, is only superseded in importance by the day Haskell introduced me to Lisp."]
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-100.tc.flex.justify-around "For a more in depth rendition of those events, check out the next post:"
      [:a.w-40.bb.bw3 {:class link-styling-x :href "#/how-lisp"} "How I Ended Up Writing Lisp"]]
     [:div.w-100.bt.bw2.b--black.flex.justify-center
      [:a.mv3 {:class link-styling-x :href "#/posts"} "Back to posts."]]]]])
