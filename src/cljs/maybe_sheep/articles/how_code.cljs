(ns maybe-sheep.articles.how-code
  (:require [maybe-sheep.articles.article-data :refer [posts-anchor portfolio-anchor
                                                       github-anchor twitter-anchor
                                                       about-anchor misc-anchor]]))

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
     [:section.flex.flex-column.h-75.w-75] 
     [:p.lh-copy.near-black.bb.bw2.w-100.f3.fw6.navy.bb.bw2 "How I Ended Up Programming"]
     [:p.lh-copy.near-black "TL;DR - I am still not entirely sure."]
     [:p.lh-copy.near-black] 
     "So, for those of us with long form appetites, this particular section of my personal narrative begins many, 
        many years ago. Thought it will meander, I promise it will eventually lead us to the desired destinations. 
       For all intents and purposes, I was very much never supposed to become a programmer, 
       as I've always had a strong aptitude for and inclination towards the creative arts, chiefly music.
       Some of my brightest childhood memories revolve around songs, sounds, lyrics, modulations, arpeggios, 
       the soundscape backdrop of hip hop records that mesmerized me, and by the time I hit double digits in age, 
       I had very much dedicated myself to this craft, the writing of lyrics, raps, poems, haikus, strange incoherent fiction- yes, 
      I had found my something in this life."
     [:p.lh-copy.near-black 
      "In tandem with this, I was a voracious reader, 
      I consumed a large amount of Scott Westerfeld, Brian Jacques, Paul Fleischman, more Getrude Chandler than was healthy, 
      and was content to spend most of my day consuming or producing words. 
      Then, one fateful year, in the mid aughts, a young boy, nestled in a couch corner with a book, 
      spied a commercial for a video game, that was tantalizing, mesmerizing, beyond belief, 
      with FF7 characters fighting alongside Disney Characters, and damn if that ad was not super effective."]
     [:p.lh-copy.near-black 
      "I had to have it."]
     [:p.lh-copy.near-black 
      "Of course, this wasn't rather likely at the time, because it required the purchase of an entirely new system, 
       the Playstation 2, which was retailing at $299 in those days. That was a lot of money for my parents to put together at that time. 
       I had also just gotten a gameboy a year and a half prior for my birthday, and when your parents are working people, that's considered \"Still new\", 
       because \"You just got that thing\"- all of which are true, until you factor in a childs inability to grasp the relationship between lengths of time and the value of newfangled electronic devices. 
       As had many a child before me, and as many a child after me has, I wore my parents down into a fine dust, by sheer dint of persistence,
      at which point buying me the thing likely became worth it simply for the fact that they wouldn't have to hear about it again."]
     [:blockquote.f3.bg-animate.hover-animate.hover-bg-washed-green.hover-purple.pa1.dark-gray.grow.animate.fw5.grow.bl.br.bw2.b--near-black.w-100.tc.flex.justify-around] 
     "For a more in depth rendition of those events, check out the next post:"
      [:a.w-40.bb.bw3 {:class link-styling-x :href "#/how-lfp"} "How I Became A Functional Programmer"]
      [:div.w-100.bt.bw2.b--black.flex.justify-center]
      [:a.mv3 {:class link-styling-x :href "#/posts"} "Back to posts."]]))
