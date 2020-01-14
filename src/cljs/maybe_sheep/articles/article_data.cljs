(ns maybe-sheep.articles.article-data
  (:require [maybe-sheep.pages.homepage :refer [link-styling-x]]))

(defn labs-article-data []
  [:div "hi"])

(defn github-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "https://github.com/LorenzoEvans"} "Github"])
(defn twitter-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "https://twitter.com/0xLEDev"} "Twitter"])
(defn posts-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "#/posts"} "Posts"])
(defn misc-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "#/misc"} "Misc"])
(defn about-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "#/about"} "About"])
(defn portfolio-anchor [] [:a.w-90.mono-gf {:class link-styling-x :href "http://www.lorenzoevans.me/"} "Portfolio"])

(defn in-progress []
  [:div.f-subheadline.avenir.fw5.tc.hover-bg-light-gray.hover-dark-pink.pa2.grow.ba.b--purple.bw2.br2 "Article :: In progress..."])

(defn how-fp []
[:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
 [:section.flex.flex-row.justify-between.w-100
 [posts-anchor]
 [portfolio-anchor]
 [github-anchor]
 [twitter-anchor]
 [about-anchor]
 [misc-anchor]]
 [:section.flex.flex-column.h-75.w-75

  [:p.f3.fw6.navy.bb.bw2 "How I Became a Functional Programmer"]
  [:div.lh-copy
   [:p.lh-copy.pt1.pb1.near-black 
   "The story starts about a year and a half ago, give or take a couple of months. I was enrolled in the Web Development track at Lambda, and was undergoing both the general struggles of learning to program, along with learning to program in JavaScript. To be quite honest, I'd developed (pun intended) quite a bit of frustration towards the language, one that was perhaps stoked by the long standing Dunning-Kruger effect. It seemed as if, right when I felt like I understood how JavaScript worked, some new syntactical quirk, change in the actual language, or unique concept would show up and leave me feeling confused all over again."] 
   [:p.lh-copy.pt1.pb1.near-black "Nevertheless, I kept at it, and did relatively decent battle with the language, right up until DOM manipulation. A project that required us to render UI into html based on JavaScript class 'objects' and data-attributes floored me. I considered dropping out, and eventually got the project done a few days late, but at that point, I realized that the problem wasn't how JavaScript works, it was how I expected a procedure, or a piece of logic to execute, to be handled and evaluated, based on the way I think about things."] 
   [:p.lh-copy.pt1.pb1.near-black "So, naturally, I started to wonder about what other programming languages existed, and how they worked. I wondered if there was something out there that resonated with my thought process more. The answers I found were interesting, but perplexing, generally containing words like mutable state and static types, and pure functions being strewn about. I knew that I had to look into this when I had the time, and spent a few weeks or months progressing with JavaScript, conquering old frustrations and meeting new ones, all the while hearing the refrain of Stack Overflow responses in the back of my ear, as if on loop in the dark corners of my mind."]
   [:blockquote.bg-animate.hover-animate.hover-bg-washed-red.hover-purple.pa1.f2.dark-gray "FP will save you (save you...(save you...))"]
   [:p.lh-copy.pt1.pb1.near-black "One night, a few months later as I was working on my first to-do app with Bootstrap/React (maybe it was calculator), I was scrolling through Twitter, and spied some of the strangest code I'd ever seen, I didn't know what was going on at all, but I was also instantly fascinated."]
   [:blockquote.f1.bg-animate.hover-animate.hover-bg-near-black.hover-purple.pa1.moon-gray "module Lib"
   [:div.hover-hot-pink 
   [:div.ml6 "( someFunc"]
   [:div.ml6 ") where"]]

   [:div.hover-light-blue "someFunc :: IO ()"]
   [:div.hover-light-green "someFunc = putStrLn \"someFunc\""]]
   [:p.lh-copy.pt1.pb1.near-black "There was more, but these few lines of code were enough to seduce me, and I immediately had to find out what it was. As you've probably guessed by now, it was Haskell, which happens to be a strictly typed, purely functional, and extremely unique language. It was love at first sight. I started learning me a Haskell for great good. I was intoxicated. I could not believe how useful list comprehensions were, guards as conditional statements, or function composition was, but there was something else that really seaked my resolve to become a functional programmer:"]
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
    [:a.w-40.bb.bw3 {:class link-styling-x :href "#/how-lisp"} "How I Ended Up Writing Lisp"]]]]
   [:div.w-100.bt.bw2.b--black.flex.justify-center
    [:a.mv3 {:class link-styling-x :href "#/posts"} "Back to posts."]]])

(defn how-lisp []
  )

(defn hoon-school-week-1
  []
  (fn []
    [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
     [:section.flex.flex-column.h-75
      [:p.f3.fw6.navy.bb.bw2 "I'd been interested in Urbit for a while, and last week, opportunity struck."]
      [:span.grow.f-headline.fw6.near-black.tc "~"]
      [:blockquote.lh-title.f3.fw6.silver "Back in 2017, I'd stumbled upon this strange and peculiar project, based on planets with strange names."]
      [:p.lh-title.f4.fw6.silver "This is exactly the weird I'm here for, so I snooped around the docs, and....had no idea what was going on."]
      [:p.lh-solid
       [:p.lh-copy.pt1.pb1.near-black "The only recourse for me at the moment was to keep my eye on it, and stow it away in the back of my mind, where many other things sat."]
       [:p.lh-copy.pt1.pb1.near-black "Eventually, I came back to it, read tweets, saw blog posts, and began to develop a serious interest in it, this idea of a pre-bitcion semi-decentralized virtual micro-computer/OS, designed from scratch. There just really is no way to express how piqued my curiosity was. I remember coming to it after I had been writing code for several months, and thinking this is either the next Xanadu or the future has arrived, again."]
       [:p.lh-copy.pt1.pb1.near-black "Fast forward many moons (so intended), and here I find myself, having completed the Lambda curriculum, starting out on the job search, and looking to expand my knowledge beyond the boundaries of the technologies taught at Lambda. I've settled into the functional world, dabbling in Haskell, Scheme, Elm, and finally settling on Clojure (this whole blog is done in Clojurescript), and obviously am interested in the bevy of non-centralized solutions, concepts and belief systems that, while not at all new, really exploded into popularity via the hyperbolic rise of corn. When number go up, people pay attention."]
       [:p.lh-copy.pt1.pb1.near-black "Now, getting a job in software after a year and a half of (albeit very intense) coding, is very hard, and has been a greed type of time consuming, so I haven't had the time to dedicate to learning Urbit on my own, however, a week or two ago, something floated down my Twitter river and jumped out at me"]
       [:p.lh-copy.pt1.pb1.near-black "Urbit, the actual company, was offering a six week self paced course for learning Hoon, the language for programming on/in/with (couldn't decide) Urbit, and I jumped on it. Since the course would obviously have structure, I'd be able to move through the information available much quicker, because I wouldn't have to figure it out on my own, which would allow me to better manage my time with my other obligations, with the time investment coming in at 4-6 hours a week (to complete the assignments, but interest drove me beyond that quickly)."]
       [:p.lh-copy.pt1.pb1.near-black "So, excitedly, I filled out the application, and waited eagerly for my response, and a few days later, I got an email, saying I'd gotten in, and then, things got real"]
       [:span.lh-copy.pt1.pb1.near-black "When I read "] [:span.i.fw4.fgrow.hover-bg-black.hover-hot-pink.near-black.hover-animate.hover-bg-animate "\"If you don't have a planet, reach out and I'll get you one\""] [:span.lh-copy.pt1.pb1.near-black " I just sat there. Thunderstruck."]
       [:p.lh-copy.pt1.pb1.near-black "After a minute of gathering myself, I did exactly that, and a few days later, recieved an email containing invitation to Urbit from ~padmyn-pasnux, and accepted. Thus began the process of booting my ship. Having already downloaded the Urbit binary, I downloaded my master-ticket, my keyfile, and got my first Urbit up and running, which wasn't too harrowing, there were some hiccups, and I learned the hard way don't move a running Urbit's pier (the term for the directory where your planet actually lives), and can now archive my Urbit, reset my Network keys and perform a personal breach in my sleep."]
       [:blockquote.light-red.f3.fw5 "So, what is it like?"]
       [:p.lh-copy.pt1.pb1.near-black "Much like the platform itself, the school is pretty minimalist. There's a chat group for students and teachers, a notebook to which information regarding assignments and required reading are posted, a help channel, the assignments aren't graded, but they do ask for you to submit them completed. That isn't to say that the community/experience is cold, as there's generally some people conversing in multiple chats, and certainly in the Discord/Telegram channels, all of which have been very welcoming and hospitable, and willing to help clarify some of Urbit's notoriously sui generis terminology, or get you un-stuck, along with a sense that everyone here is genuinely interested in the project."]
       [:p.lh-copy.pt1.pb1.near-black.f3 "This weeks assignment:"
        [:ul
         [:li "Write a naked "
          [:span.bb.bw1.b--near-black.no-underline [:a.link.dim.navy.bb.b--near-gray.no-underline {:href "https://urbit.org/docs/tutorials/hoon/generators/"} "generator "]] "to cast an atom from one aura type to another."]
         [:li.lh-copy.pt1.pb1.near-black "We were also encouraged to boot a "]
         [:span.bb.bw1.b--near-black.no-underline [:a.link.dim.navy.bb.b--near-gray.no-underline {:href "https://urbit.org/using/develop/"} "Fakezod."]]]
        [:p.lh-copy.pt1.pb1.near-black "There were instructional videos from staff, walk throughs in the documentation, which made the homework assignment relatively easy, but it still felt like an achievement, luckily I'm used to diving into new technologies head first. I'm chomping at the bit to get next weeks assignment, and learn more about the Urbit stack."]
        [:p.lh-copy.pt1.pb1.bg-washed-green.dark-gray.fw4.f3 "If you have an urbit, send me a message at ~bilnub-bollyx."]]]]]))

(defn how-code []
  (fn []
    [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center 
     [:section.flex.flex-row.justify-between.w-100
      [posts-anchor]
      [portfolio-anchor]
      [github-anchor]
      [twitter-anchor]
      [about-anchor]
      [misc-anchor]]
     [:section.flex.flex-column.h-75.w-75 
     [:p.lh-copy.near-black.bb.bw2.w-100.f3.fw6.navy.bb.bw2.tc "How I Ended Up Programming"]
     [:p.lh-copy.pt1.pb1.near-black "TL;DR - I am still not entirely sure."]
     [:p.lh-copy.pt1.pb1.near-black "So, for those of us with long form appetites, 
        this particular section of my personal narrative begins many, 
        many years ago. Thought it will meander, I promise it will eventually lead us to the desired destinations."]
     [:p.lh-copy.pt1.pb1.near-black "For all intents and purposes, I was very much never supposed to become a programmer, as I've always had a strong aptitude for and inclination towards the creative arts, chiefly music."]
     [:p.lh-copy.pt1.pb1.near-black "Some of my brightest childhood memories revolve around songs, sounds, lyrics, modulations, arpeggios, the soundscape backdrop of hip hop records that mesmerized me, and by the time I hit double digits in age, I had very much dedicated myself to this craft, the writing of lyrics, raps, poems, haikus, strange incoherent fiction- yes, I had found my something in this life."]]]))