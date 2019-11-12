(ns maybe-sheep.articles.article-data)

(defn labs-article-data []
  [:div "hi"])


(defn how-fp-data []
  [:div.avenir.bg-near-white.flex.flex-column.pa4.w-75.justify-center.ba.b--black.bw2 
   [:div.flex.flex-row.flex-wrap
    [:div
     [:header.self-center  "How I Ended Up A Functional Programmer"]
     [:p.f3.fw6.navy.bb.bw2 "How a student taking Lambda's Web Development course ended up staying up extra late after class to read about Haskell."]]]
   [:div.flex.flex-column.bg-near-white.w-100.h-100
    [:p.lh-title.f3.fw6.light-purple "I recall this moment fondly."]
    [:p.lh-copy "I was working through DOM manipulation at Lambda, getting elements by Id, writing markdown parsers in code challenges, and constantly forgetting to initialize my iterator variable, undergoing the general struggles of learning JavaScript."]
    [:p.lh-copy "To be quite honest, I'd developed (pun intended) a bit of rancor towards the language, one that was perhaps stoked by the spectre of the industry, Imposter Syndrome, and the long standing Dunning-Kruger effect."]
    [:p.lh-copy "Nevertheless, I kept running into the same sort of problem: the things I expected to work didn't and things I expected to work did, I was tripping over type coercion left and right, being reminded that this wasn't defined, and started to ask questions. To Google. The answers I found were interesting, but perplexing, with words like mutable state and static types and functional programming being strewn about."]
    [:p.lh-copy "Naturally, I decided to take a look into this when I had the time, and spent a few weeks or months progressing with JavaScript, conquering old frustrations and meeting new ones, all the while hearing the refrain of Stack Overflow responses in the back of my ear, as if on loop in the dark corners of my mind."]]])
