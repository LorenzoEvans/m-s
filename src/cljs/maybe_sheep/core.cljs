(ns maybe-sheeps.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [maybe-sheeps.events :as events]
   [maybe-sheeps.routes :as routes]
   [maybe-sheeps.views :as views]
   [maybe-sheeps.articles.article-content]
   [maybe-sheeps.articles.article-data]
   [maybe-sheeps.config :as config]))


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