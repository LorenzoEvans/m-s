(ns maybe-sheep.events
    (:require [maybe-sheep.articles.article-content :refer [content-store]]
              [re-frame.core :refer [reg-event-db reg-event-fx reg-fx inject-cofx trim-v after path debug]]
              [maybe-sheep.routing :as router]))

(reg-fx :set-url
    (fn [{:keys [url]}]
        (router/set-token! url)))

(reg-event-fx :set-active-page
    (fn [{:keys [db]} [_ {:keys [page slug]}]]
        (let [set-page (assoc db :active-page page)]
            (case page
                :home {:db set-page
                       :dispatch [[:get-articles {:limit 10}]]}
                :article {:db (assoc :set-page :active-article slug)
                          :dispatch [:get-articles]}))))

(reg-event-db :set-active-article
    (fn [{:keys [db]} [_ slug]]
        {:db (assoc db :active-article slug)}))

(reg-event-fx :get-articles
    (fn [{:keys [db]} [_ params]]
        {:http-xhrio {:method :get
                      :uri (endpoint "posts")
                      :params params
                      :headers (auth-header db)
                      :response-format (json-response-format {:keywords? true})
                      :on-success [:get-articles-success]
                      :on-failure [:api-request-error :get-articles]}
         :db (-> db
                 (assoc-in [:loading :articles] true)
                 (assoc-in [:filter :offset] (:offset params)))}))
        
