(ns maybe-sheep.routing
  (:require [reitit.frontend :as r]
            [bidi.bidi :as bidi]
            [re-frame.core :refer [dispatch]]
            [kibu/pushy :as pushy]
            [maybe-sheep.articles.article-content :refer [content-store]]))


(def routes
  ["/" {"" :home
        "/posts" {[:slug] :article}}])

(def history 
  (let [dispatch #(dispatch [:set-active-page {:page (:handler %)
                                               :slug (get-in % [:route-params :slug])}])
        match #(bidi/match-route routes %)]
        (pushy/pushy dispatch match)))
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