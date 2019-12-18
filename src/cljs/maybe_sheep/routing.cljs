(ns maybe-sheep.routing
  (:require [reitit.frontend :as r]
            [bidi.bidi :as bidi]
            [kibu/pushy :as pushy]
            [maybe-sheep.articles.article-content :refer [content-store]]))

; (def router
;   (r/router
;    [["/" :index]
;     ["/posts"
;      ["" :posts]
;      ["/:post-id" :post]]
;     ["/about" :about]
;     ["/misc" :misc]
;     ]))

; (defn path-for [route & [params]]
;   (if params
;     (:path (r/match-by-name router route params))
;     (:path (r/match-by-name router route))))