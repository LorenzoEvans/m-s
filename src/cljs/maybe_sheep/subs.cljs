(ns maybe-sheep.subs
    (:require [re-frame.core :refer [reg-sub subscribe]]))
              ;import db

(defn reverse-cmp 
    [a b]
    (compare a b))

(reg-sub :articles
    (fn [db _]
        (->> (:articles db)
             (vals)
             (sort-by :epoch reverse-cmp))))

(reg-sub :active-page
    (fn [db _]
        (:active-page db)))

(reg-sub :articles-count
    (fn [db _]
        (:articles-count db)))
             
(reg-sub :active-article
    (fn [db _]
        (let [:active-article (:active-article db)]
            (get-in db [:articles :active-article]))))
