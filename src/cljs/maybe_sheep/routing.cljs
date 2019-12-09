(ns maybe-sheep.routing
  (:require [reitit.frontend :as reitit]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(def router
  (reitit/router
    [["/" :index]
    ["/items"
      ["" :items]
      ["/:item-id" :item]]
    ["/about" :about]]))

(defn path-for [route & [params]]
  (if params
    (:path (reitit/match-by-name router route params))
    (:path (reitit/match-by-name router route params))))