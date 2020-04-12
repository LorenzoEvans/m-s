(ns maybe-sheep.articles.how-fp
  (:require [maybe-sheep.pages.homepage :as home]
            [maybe-sheep.styles :as styles]))

(defn how-fp []
  [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
   [:section.flex.flex-row.justify-between.w-100
    [home/posts-anchor]
    [home/portfolio-anchor]
    [home/github-anchor]
    [home/twitter-anchor]
    [home/about-anchor]
    [home/misc-anchor]]
   [:section.flex.flex-column.h-75.w-75
  
    [:p.f1.fw6.navy.bb.bw2.tc.mb2 "How I Became a Functional Programmer"]
    [:div.lh-copy
     [:p.lh-copy.pt1.pb1.near-black 
      "The story starts about a year and a half ago, give or take a couple of months. I was enrolled in the Web Development track at Lambda, and was undergoing both the general struggles of learning to program, along with learning to program in JavaScript. To be quite honest, I'd developed (pun intended) quite a bit of frustration towards the language, one that was perhaps stoked by the long standing Dunning-Kruger effect. It seemed as if, right when I felt like I understood how JavaScript worked, some new syntactical quirk, change in the actual language, or unique concept would show up and leave me feeling confused all over again."] 
     [:p.lh-copy.pt1.pb1.near-black "Nevertheless, I kept at it, and did relatively decent battle with the language, right up until DOM manipulation. A project that required us to render UI into html based on JavaScript class 'objects' and data-attributes floored me. I considered dropping out, and eventually got the project done a few days late, but at that point, I realized that the problem wasn't how JavaScript works, it was how I expected a procedure, or a piece of logic to execute, to be handled and evaluated, based on the way I think about things."] 
     [:p.lh-copy.pt1.pb1.near-black "So, naturally, I started to wonder about what other programming languages existed, and how they worked. I wondered if there was something out there that resonated with my thought process more. The answers I found were interesting, but perplexing, generally having words like mutable state and static types, and pure functions woven throughout them. I knew that I had to look into this when I had the time, and spent a few weeks or months progressing with JavaScript, conquering old frustrations and meeting new ones, all the while hearing the refrain of Stack Overflow responses in the back of my ear, as if on loop in the dark corners of my mind."]
     [:blockquote.bg-animate.hover-animate.hover-bg-washed-red.hover-purple.pa1.f2.dark-gray "FP will save you (save you...(save you...))"]
     [:p.lh-copy.pt1.pb1.near-black "One night, a few months later as I was working on my first to-do app with Bootstrap/React (maybe it was calculator), I was scrolling through Twitter, and spied some of the strangest code I'd ever seen, I didn't know what was going on at all, but I was also instantly fascinated:"]
     [:blockquote.f1.bg-animate.hover-animate.hover-bg-near-black.hover-purple.pa1.moon-gray "module Lib"
      [:div.hover-hot-pink 
       [:div.ml6 "( someFunc"]
       [:div.ml6 ") where"]]
  
      [:div.hover-light-blue "someFunc :: IO ()"]
      [:div.hover-light-green "someFunc = putStrLn \"someFunc\""]]
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
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-100.tc.flex.justify-around "For a more in depth rendition of those events, stick around for the next post:"
      [:a.w-40.bb.bw3 {:class styles/link-styling-x :href "#"} "How I Ended Up Writing Lisp"]]]]
   [:div.w-100.bt.bw2.b--black.flex.justify-center
    [:a.mv3 {:class styles/link-styling-x :href "#/posts"} "Back to posts."]]])