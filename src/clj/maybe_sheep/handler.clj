(ns maybe-sheep.handler
  (:require
   [reitit.ring :as reitit-ring]
   [maybe-sheep.middleware :refer [middleware]]
   [hiccup.page :refer [include-js include-css html5]]
   [config.core :refer [env]]))

(def mount-target
  [:div#app
   [:h2 "Welcome to maybe-sheep"]
   [:p "please wait while Figwheel is waking up ..."]
   [:p "(Check the js console for hints if nothing exciting happens.)"]])

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css "/css/site.css" "https://unpkg.com/tachyons@4.10.0/css/tachyons.min.css")])

(defn loading-page []
  (html5
   (head)
   [:body {:class "body-container"}
    mount-target
    (include-js "/js/app.js")]))


(defn index-handler
  [_request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (loading-page)})

(def app
  (reitit-ring/ring-handler
   (reitit-ring/router
    [["/" {:get {:handler index-handler}}]
     ["/posts"
      ["" {:get {:handler index-handler}}]
      ["/:post-id" {:get {:handler index-handler
                          :parameters {:path {:post-id int?}}}}]]
     ["/about" {:get {:handler index-handler}}]])
   (reitit-ring/routes
    (reitit-ring/create-resource-handler {:path "/" :root "/public"})
    (reitit-ring/create-default-handler))
   {:middleware middleware}))
