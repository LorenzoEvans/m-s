(ns maybe-sheep.events
    (:require [maybe-sheep.articles.article-content :refer [content-store]]
              [re-frame.core :refer [reg-event-db reg-event-fx reg-fx inject-cofx trim-v after path debug]]
              [maybe-sheep.routing :as router]))

(reg-fx :set-url
    (fn [{:keys [url]}]
        (router/set-token! url)))

(reg-event-fx :set-active-page
    (fn-traced [{:keys [db]} [_ {:keys [page slug]}]]
        (let [set-page (assoc db :active-page page)]
            (case page
                :home {:db set-page
                       :dispatch [[:get-articles {:limit 10}]]}
                :article {:db (assoc :set-page :active-artle slug)
                          :dispatch [:get-articles]}))))

(reg-event-db :set-active-article
    (fn-traced [{:keys [db]} [_ slug]]
        {:db (assoc db :active-article slug)}))

