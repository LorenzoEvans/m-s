(ns maybe-sheep.routing
  (:require [reitit.frontend :as r]
            [bidi.bidi :as bidi]
            [re-frame.core :refer [dispatch]]
            [pushy.core :as pushy]
            [maybe-sheep.articles.article-content :refer [content-store]]))


(def routes
; Routes define what will be shown when certain path are hit. A route is a vector with a pattern to match, and a result for the match.
  ["/" {"" :home
        "/posts" {[:slug] :article}}])

(def history 
; We keep track of history so we can navigate back and forward, and pushy does that, by consuming the dispatch function
; what happens on dispatch and match: what routes should we match.
  (let [dispatch #(dispatch [:set-active-page {:page (:handler %)
                                               :slug (get-in % [:route-params :slug])}])
        match #(bidi/match-route routes %)]
       (pushy/pushy dispatch match)))

(defn- parse-url
; bidi/match-route converts urls to data structures and check if the route exists in our route.
  [url]
  (bidi/match-route routes url))

(defn start!
  (pushy/start! history))

(defn url-for (partial bidi/path-for routes))

(defn set-token! [token]
  (pushy/set-token! history token))
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