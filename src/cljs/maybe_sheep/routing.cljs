(ns maybe-sheep.routing
  (:require [reitit.frontend :as r]))

(def router
  (r/router
   [["/" :index]
    ["/posts"
     ["" :posts]
     ["/:post-id" :post]]
    ["/about" :about]]))

(defn path-for [route & [params]]
  (if params
    (:path (r/match-by-name router route params))
    (:path (r/match-by-name router route))))