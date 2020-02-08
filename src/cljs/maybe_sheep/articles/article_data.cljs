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
