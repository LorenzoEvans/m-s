(ns maybe-sheep.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [maybe-sheep.events :as events]
   [maybe-sheep.routing :as routes]
   [maybe-sheep.views :as views]
   [maybe-sheep.articles.article-content]
   [maybe-sheep.articles.article-data]
   [maybe-sheep.config :as config]))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn -main []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))