(ns maybe-sheep.articles.why-hard
  (:require [maybe-sheep.articles.article-data :refer [posts-anchor portfolio-anchor
                                                       github-anchor twitter-anchor
                                                       about-anchor misc-anchor]]
            [maybe-sheep.pages.homepage :refer [link-styling-x]]))

(defn why-hard []
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
  
    [:p.f1.fw6.navy.bb.bw2 "Why Programming Is Hard"]
    [:div.lh-copy
     [:p.lh-copy.pt1.pb1.near-black] 
     "In my journey as a software developer, I’ve learned that, surprise surprise, learning how to program (well), is very difficult, in a way that I don’t quite believe many other things are, and began to get very curious about why this difficulty is so unique. I’ve noticed that the reputation of the difficulty of programming preceeds it, and leads some people to preclude it as a skill, hobby, or past-time that they can pick up, and become competent at." 
     [:p.lh-copy.pt1.pb1.near-black "I’ve tried to pitch programming to a few friends, mostly mechanics and audio-engineers, given that their current hobby is at least technical enough (seriously, properly mixing layered audio so that the low end of an 808 doesn’t distort a particularly thick synth pad is no joke), that I felt they wouldn’t have as much of a problem transitioning into this field, as people who’ve never dealt with anything technical, mechanical, electronic, etc, or perhaps aren’t innately inclined towards those things."] 
     [:p.lh-copy.pt1.pb1.near-black " I’m in my 8th month at Lambda School, and it has been a riveting, exhilarating, emotional journey, and many times, has put me face to face with challening concepts, tasks, and questions."]
     [:p.lh-copy.pt1.pb1.near-black "That being said, given some elbow grease, patience, combined with utilizing the wealth of knowledge available in terms of the training kit, the PM’s, fellow students and instructors, I have yet to come face to face with something in programming that I can’t learn. At this point, actually, I simply don’t believe it exists. Not for me, you, or anyone else. The question I’ve been trying to answer is, what are the barriers, that have kept people (and even me, prior to 2017), away from programming?"]
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-dark-gray.hover-light-green.pa1.moon-gray "In my personal, and humble opinion, I believe the following four things (in no particular order), are the main culprits behind people’s lack of self belief with regards to them becoming a programmer:"]
     [:p.lh-copy.pt1.pb1.near-black.f1.tc.fw3 "Failure"]
     [:blockquote.f3.hover-dark-pink.hover-bg-black.hover-animate.bg-animate.pa1.dark-gray.fw5.bl.br.bw2.b--near-black.w-100.tc.tracked.i "Failure, defeat, loss- whatever you would like to call it, is a feeling we all know, and quite frankly, probably secretely detest, and in programming, there is a lot of it."]
     [:p.lh-copy.pt1.pb1.near-black "It differs from the failure you would experience, say, playing on a losing sports team, or losing a client account on a job. In those two instances, even when you own up to your role in the mistake, there are other people who are at fault for things. Outside of a situation where an individual has a particularly low self-esteem, or negative self-image, it’s just not logical to feel as if you’re entirely responsible for something falling short."]
     [:p.lh-copy.pt1.pb1.near-black "This is not exactly the case with programming, particularly in the learning/beginner phase. Your errors, come from your code, that you wrote, and the computer, being the non-feeling inanimate object that it is, never hesitates to throw a big juicy error message in your face. Be it a coding challenge, or a server crash, or a buggy animation, you are forced to look your own inadequacies, lack of skill, or understanding dead in the face."]
     [:p.lh-copy.pt1.pb1.near-black "You absolutely have to get down into the trenches, the dirt, and dig, which can be an extremely distasteful type of grueling, if you don’t have the right mindset. Further more, I think the other side of the coin is that programming will quickly teach you, and promptly remind you, that you aren’t perfect, and never will be. That might sound minor to some, but I think deep down, a lot of us (full disclojure, I’m a perfectionist) cling to the idea that some day, we might achieve a level or state of perfection."]
     [:p.lh-copy.pt1.pb1.near-black "This is a very bitter pill to swallow once, let alone the multitude of times you will have to do so throughout the entirety of your time as a programmer, because there will always be bugs, spelling errors, smelly code, etc."]
     [:p.lh-copy.pt1.pb1.near-black "Unlike some trades, where an expert or master can come in and show you the right way to do a thing, like how to layup in basketball, or how to change a spark plug, and thus keep you away from facing failure as often as you might without them, programming doesn’t really have a way to side-step repeated failed attempts. Someone can come along and tell you “How to write a test”, or “How to add dynamic functionality to a static website” all day long, but it won’t be converted into ability by listening."]
     [:p.lh-copy.pt1.pb1.near-black.f3.tc "The hard truth here is that failure is (generally speaking) good, and failure is growth, and what is good, doesn’t always necessarily feel good, and growth implies growing pains. If you’re struggling, you’re probably learning more than when it “just clicks”."]
     [:p.lh-copy.pt1.pb1.near-black.f1.tc.bb.bw2 "Jargon"]    
     [:blockquote.f3.hover-dark-pink.hover-animate.bg-animate.hover-bg-black.pa1.dark-gray.fw5.bl.br.bw2.b--near-black.w-100.tc.tracked.i "In my personal opinion, outside of perhaps politics and economics/finance, programming is the undisputed king of jargoning. You have preprocessors, booleans, toolchains, segfaults, classes, methods, all of which have extreme depth and breadth in their own right."]
     [:p.lh-copy.pt1.pb1.near-black "Even though they don’t necessarily represent “complex” things, or have to be explained in a complex manner, keeping track of the dictionary definition, along with the contextual definition (for example, Java classes vs. JS classes), can be absolutely daunting, and that’s before we get into the really heady topics like authentication, algorithm optimization, abstract syntax trees, and ring-buffers."]
     [:p.lh-copy.pt1.pb1.near-black "I think a lot of times people get stuck in what I like to call the wikipedia tree, where you look at one thing, and realize that’s predicated upon two things, that are predicated upon three other things, that tend to be equally, and sometimes even more vast than the top-level topic that lead you there. I’ve done it, and I’m certain you have as well."]
     [:p.lh-copy.pt1.pb1.near-black "The worst part, is that when you finally get to the bottom of something, and look up at the 14 tabs in your browser, you don’t realize the information you’ve picked up, just the complete awe-inspiring size of how much learning you have left to do."]
     [:p.lh-copy.pt1.pb1.near-black "It can, at times be demoralizing, because you can’t imagine how your going to learn, and memorize all of this new information (newsflash: no one memorizes all of it. Not even that dev you’ve been following who built Facebook, Bitcoin and Twitter at the age of three in assembly and html), in the amount of time you think you need to learn it in."]
     [:p.lh-copy.pt1.pb1.near-black.f3.tc "At the end of the day, most of these terms sound scarier than the meaning behind them, and all of them can be boiled down into laymans terms. Think of them as the green floating head in the wizard of Oz. There’s nothing behind them but an old man pulling some gears and levers. You can take an old man."]
     [:p.lh-copy.pt1.pb1.near-black.f1.tc.bb.bw2 "Abstraction && Abstractness"]  
     [:p.lh-copy.pt1.pb1.near-black "While the abstract concepts of programming and computation can often be extremely interesting, they can be very hard to get a working grasp on, as they don't relate to any concepts you're presently aware of."]  
     [:p.lh-copy.pt1.pb1.near-black "This means that any time you want to deal with an abstract topic, you have to employ extra cognitive overhead in order to deal with the nuance at hand. Because there effectively isn’t a yes or no answer to go to, you have to be able to generate any of the possible answers, at any time, while juggling the cognitive dissonance of something being (seemingly) right and wrong simultaneously."]
     [:p.lh-copy.pt1.pb1.near-black "Every day life, a lot of the time, doesn’t require us to be this delicate about our decisions. Even though we could get philosophical about, say, whether or not $2.57 is an appropriate price for gas, we don’t need to employ that level of thought in deciding whether we’re going to pay that much. Maybe it’s a deal, because we saw $2.67 and $2.71 on the way there, maybe it’s not because a friend just told us a nearby gas station is only charging $2.23."]
     [:p.lh-copy.pt1.pb1.near-black "The double whammy comes in, because we are required to take this abstract concepts, and use them to create abstractions upon procedures we want to instruct our computer to perform. We have to think about the operations we want our algorithms to execute upon our data, and neatly package that all into readable, elegant, and optimal code, and that’s no easy task. There are whole careers and sciences devoted to this aspect of development alone."]
     [:p.lh-copy.pt1.pb1.near-black "The process of grasping extremely nebulous concepts, and then filtering out all the minutae into an abstraction that can be used reliably, is mentally taxing, and I believe it makes people feel as if they aren’t smart enough to become programmers, because they become confused."]
     [:p.lh-copy.pt1.pb1.near-black.f3.tc "You’re not “too dumb” to program because you get confused. In fact, I think confusion is a good sign, because it means you’re really doing some deep thinking about the tasks and tools available. Also, quite frankly, programming is confusing. So what? Tying your shoes and going potty were confusing too once."]  
     [:p.lh-copy.pt1.pb1.near-black.f1.tc.bb.bw2 "Hollywood & Society"]
     [:div.flex.flex-column.justify-center
      [:img.h-50.w-50.self-center {:src "../assets/MrRobotHackTA.jpeg"}]]
     [:blockquote.f3.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.bl.br.bw2.b--near-black.w-100.tc "inc :: Num a => a -> a"
      [:hr.w-50.bb.bw2.b--navy]
      [:div.fw1 "(the function inc is of type Num a, meaning it can accept any value so long as it is of the Num typeclass, as it expects one of those values, and will also return one. )"]]
     [:p.lh-copy.pt1.pb1.near-black "The number of hours lost that would have been saved if I had've been able to express to my compiler the nature, the type I expected a function to be working with, and what order, at every stage of it's execution are too great, to many. There was freedom in this strictness. I was free to define as strictly as I pleased, or as loosely I as pleased, the aforementioned criteria of a function. It was then that I resolved to become a Haskeller, and began studying the language, and all things functional programming, and quickly, two things happened: I realized I had fallen into a rabbit-hole, and that there were things way, way stranger than JavaScript that awaited me on this path."]
  
     [:div.w-100.bt.bw2.b--black.flex.justify-center
      [:a.mv3 {:class link-styling-x :href "#/posts"} "Back to posts."]]]]]))
