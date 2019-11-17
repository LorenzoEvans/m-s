(ns maybe-sheep.articles.article-data)

(defn labs-article-data []
  [:div "hi"])


(defn how-fp-data []
[:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
 [:section.flex.flex-column.h-75
  [:p.f3.fw6.navy.bb.bw2 "Q: Why would a student taking Lambda's Web Development course stay up extra late after class to read about Haskell?"]
  [:p.lh-title.f3.fw6.silver "A: Well, let's dig in."]
  [:p.lh-title.f4.fw6.silver "Once upon a time..."]
  [:div.lh-solid 
   [:p.lh-copy.near-black "I was working through DOM manipulation at Lambda, getting elements by Id, writing markdown parsers in code challenges, and constantly forgetting to initialize my iterator variable, undergoing the general struggles of learning JavaScript."]
   [:p.lh-copy.near-black "To be quite honest, I'd developed (pun intended) a bit of rancor towards the language, one that was perhaps stoked by the spectre of the industry, Imposter Syndrome, and the long standing Dunning-Kruger effect."]
   [:p.lh-copy.near-black "Nevertheless, I kept running into the same sort of problem: the things I expected to work didn't and things I expected to work did, I was tripping over type coercion left and right, being reminded that this wasn't defined (or forgetting to bind it), and the event loop still boggles me. So, naturally, I started to ask questions. To Google. The answers I found were interesting, but perplexing, with words like mutable state and static types, and pure functions being strewn about."]
   [:p.lh-copy.near-black "I decided that I wanted to take a look into this when I had the time, and spent a few weeks or months progressing with JavaScript, conquering old frustrations and meeting new ones, all the while hearing the refrain of Stack Overflow responses in the back of my ear, as if on loop in the dark corners of my mind."]
   [:blockquote.bg-animate.hover-animate.hover-bg-washed-red.hover-purple.pa1.f2.dark-gray "FP will save you (save you...(save you...))"]
   [:p.lh-copy.near-black "One night, as I was working on my first todo app with Bootstrap, maybe calculator, I was scrolling through twitter, and spied some of the strangest code I'd ever seen, I didn't know what was going on at all."]
   [:blockquote.f1.bg-animate.hover-animate.hover-bg-washed-red.hover-purple.pa1.dark-gray "main :: IO ()"]
   [:p.lh-copy.near-black "There was more, but something about that line of code seduced me, and I immediately had to find out what it was. As you've probably guessed by now, it was Haskell, a strictly typed, purely functional language."] 
   [:p.lh-copy.near-black "It was love at first sight. I started learning me a Haskell for great good. I was intoxicated. I could not believe how useful list comprehensions were, they just seemed like such an ingenius way to work on data, I enjoyed guards as conditional clauses, but there was something else that really seaked my resolve to become a functional programmer."]
   [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-75.tc.tracked-mega "T Y P E S I G N A T U R E S"]
   [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-75.tc.tracked-mega "inc :: Num a => a -> a"]
   [:p.lh-copy.near-black "Wha- what do you mean, 'go back'?"] 
   [:p.lh-copy.near-black " The former will no longer suffice. "]
   [:p.lh-copy.near-black "The number of hours lost that would have been saved if I had've been able to express to my compiler the nature, the type I expected a function to be working with, and what order, at every stage of it's execution are too great, to many. I was staying here. I would be a Haskeller. I felt at home."]
   [:p.lh-copy.near-black "What I didn't realize, at the time, was that I was actually taking an extended stay at a hotel during a layover."]
   [:p.lh-copy.near-black "I was yet to reach my actual destination."]
   ]]])

(defn hoon-school-week-1
  []
  [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
   [:section.flex.flex-column.h-75
    [:p.f3.fw6.navy.bb.bw2 "I'd been interested in Urbit for a while, and last week, opportunity struck."]
    [:blockquote.lh-title.f3.fw6.silver "Back in 2017, I'd stumbled upon this strange and peculiar project, based on planets with strange names."]
    [:p.lh-title.f4.fw6.silver "This is exactly the weird I'm here for, so I snooped around the docs, and....had no idea what was going on."]
    [:section.lh-solid
     [:p.lh-copy.near-black "The only recourse for me at the moment was to keep my eye on it, and stow it away in the back of my mind, where many other things sat."]
     [:p.lh-copy.near-black "Eventually, I came back to it, read tweets, saw blog posts, and began to develop a serious interest in it, this idea of a pre-bitcion semi-decentralized virtual micro-computer/OS, designed from scratch. There just really is no way to express how piqued my curiosity was. I remember coming to it after I had been writing code for several months, and thinking this is either the next Xanadu or the future has arrived, again."]
     [:p.lh-copy.near-black "Fast forward many moons (so intended), and here I find myself, having completed the Lambda curriculum, starting out on the job search, and looking to expand my knowledge beyond the boundaries of the technologies taught at Lambda. I've settled into the functional world, working with Clojure (this whole blog is done in Clojurescript), and obviously am interested in the bevy of non-centralized solutions, concepts and belief systems that, while not at all new, really exploded into popularity via the hyperbolic rise of corn. When number go up, people pay attention."]
     [:p.lh-copy.near-black "Now, getting a job in software after a year and a half of (albeit very intense) coding, is very hard, and has been a greed type of time consuming, so I haven't had the time to dedicate to learning Urbit on my own, however, a week or two ago, something floated down my Twitter river and jumped out at me"]
     ]]])