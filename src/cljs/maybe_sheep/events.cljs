(ns maybe-sheep.events
    (:require [maybe-sheep.articles.article-content :refer [content-store]]
              [re-frame.core :refer [reg-event-db reg-event-fx reg-fx inject-cofx trim-v after path debug]]
              [maybe-sheep.routing :as router]))

(reg-fx :set-url
    (fn [{:keys [url]}]
        (router/set-token! url)))
