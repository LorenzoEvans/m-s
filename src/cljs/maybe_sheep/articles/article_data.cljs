(ns maybe-sheep.articles.article-data)

(defn labs-article-data []
  [:div "hi"])

(defn in-progress []
  [:div.f-subheadline.avenir.fw5.tc.hover-bg-light-gray.hover-dark-pink.pa2.grow.ba.b--purple.bw2.br2 "Article :: In progress..."])
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
    [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-75.tc "inc :: Num a => a -> a"
     [:hr.w-75.bb.bw2.b--navy]
     [:div.fw1 "(inc is of type Num a, meaning it can accept any value so long as it is of the Num typeclass, it expects one of those values, and will return one. )"]]
    [:p.lh-copy.near-black "Wha- what do you mean, 'go back'?"] 
    [:p.lh-copy.near-black " The former will no longer suffice. "]
    [:p.lh-copy.near-black "The number of hours lost that would have been saved if I had've been able to express to my compiler the nature, the type I expected a function to be working with, and what order, at every stage of it's execution are too great, to many. I was staying here. I would be a Haskeller. I felt at home."]
    [:p.lh-copy.near-black "What I didn't realize, at the time, was that I was actually taking an extended stay at a hotel during a layover."]
    [:p.lh-copy.near-black "I was yet to reach my actual destination."]]]])
   

(defn hoon-school-week-1
  []
  [:p.avenir.flex.flex-column.pa4.justify-around.content-center.items-center.self-center
   [:section.flex.flex-column.h-75
    [:section.f3.fw6.navy.bb.bw2 "I'd been interested in Urbit for a while, and last week, opportunity struck."]
    [:span.grow.f-headline.fw6.near-black.tc "~"]
    [:blockquote.lh-title.f3.fw6.silver "Back in 2017, I'd stumbled upon this strange and peculiar project, based on planets with strange names."]
    [:p.lh-title.f4.fw6.silver "This is exactly the weird I'm here for, so I snooped around the docs, and....had no idea what was going on."]
    [:section.lh-solid
     [:section.lh-copy.near-black "The only recourse for me at the moment was to keep my eye on it, and stow it away in the back of my mind, where many other things sat."]
     [:section.lh-copy.near-black "Eventually, I came back to it, read tweets, saw blog posts, and began to develop a serious interest in it, this idea of a pre-bitcion semi-decentralized virtual micro-computer/OS, designed from scratch. There just really is no way to express how piqued my curiosity was. I remember coming to it after I had been writing code for several months, and thinking this is either the next Xanadu or the future has arrived, again."]
     [:section.lh-copy.near-black "Fast forward many moons (so intended), and here I find myself, having completed the Lambda curriculum, starting out on the job search, and looking to expand my knowledge beyond the boundaries of the technologies taught at Lambda. I've settled into the functional world, dabbling in Haskell, Scheme, Elm, and finally settling on Clojure (this whole blog is done in Clojurescript), and obviously am interested in the bevy of non-centralized solutions, concepts and belief systems that, while not at all new, really exploded into popularity via the hyperbolic rise of corn. When number go up, people pay attention."]
     [:section.lh-copy.near-black "Now, getting a job in software after a year and a half of (albeit very intense) coding, is very hard, and has been a greed type of time consuming, so I haven't had the time to dedicate to learning Urbit on my own, however, a week or two ago, something floated down my Twitter river and jumped out at me"]
     [:section.lh-copy.near-black "Urbit, the actual company, was offering a six week self paced course for learning Hoon, the language for programming on/in/with (couldn't decide) Urbit, and I jumped on it. Since the course would obviously have structure, I'd be able to move through the information available much quicker, because I wouldn't have to figure it out on my own, which would allow me to better manage my time with my other obligations, with the time investment coming in at 4-6 hours a week (to complete the assignments, but interest drove me beyond that quickly)."]
     [:section.lh-copy.near-black "So, excitedly, I filled out the application, and waited eagerly for my response, and a few days later, I got an email, saying I'd gotten in, and then, things got real"]
     [:span.lh-copy.near-black "When I read "] [:span.i.fw4.fgrow.hover-bg-black.hover-hot-pink.near-black.hover-animate.hover-bg-animate "\"If you don't have a planet, reach out and I'll get you one\""] [:span.lh-copy.near-black " I just sat there. Thunderstruck."]
     [:p.lh-copy.near-black "After a minute of gathering myself, I did exactly that, and a few days later, recieved an email containing invitation to Urbit from ~padmyn-pasnux, and accepted. Thus began the process of booting my ship. Having already downloaded the Urbit binary, I downloaded my master-ticket, my keyfile, and got my first Urbit up and running, which wasn't too harrowing, there were some hiccups, and I learned the hard way don't move a running Urbit's pier (the term for the directory where your planet actually lives), and can now archive my Urbit, reset my Network keys and perform a personal breach in my sleep."]
     [:blockquote.light-red.f3.fw5 "So, what is it like?"]
     [:p.lh-copy.near-black "Much like the platform itself, the school is pretty minimalist. There's a chat group for students and teachers, a notebook to which information regarding assignments and required reading are posted, a help channel, the assignments aren't graded, but they do ask for you to submit them completed. That isn't to say that the community/experience is cold, as there's generally some people conversing in multiple chats, and certainly in the Discord/Telegram channels, all of which have been very welcoming and hospitable, and willing to help clarify some of Urbit's notoriously sui generis terminology, or get you un-stuck, along with a sense that everyone here is genuinely interested in the project."]
     [:p.lh-copy.near-black.f3 "This weeks assignment:"
      [:ul
       [:li "Write a naked "
        [:span.bb.bw1.b--near-black.no-underline [:a.link.dim.navy.bb.b--near-gray.no-underline {:href "https://urbit.org/docs/tutorials/hoon/generators/"} "generator "]] "to cast an atom from one aura type to another."]]
      [:li.lh-copy.near-black "We were also encouraged to boot a "
       [:span.bb.bw1.b--near-black.no-underline [:a.link.dim.navy.bb.b--near-gray.no-underline {:href "https://urbit.org/using/develop/"} "Fakezod."]]]]
     [:p.lh-copy.near-black "There were instructional videos from staff, walk throughs in the documentation, which made the homework assignment relatively easy, but it still felt like an achievement, luckily I'm used to diving into new technologies head first. I'm chomping at the bit to get next weeks assignment, and learn more about the Urbit stack."]
     [:p.lh-copy.bg-washed-green.dark-gray.fw4.f3 "If you have an urbit, send me some mail at ~bilnub-bollyx/descent-bilnub."]]]])
       