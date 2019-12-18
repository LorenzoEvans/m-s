(ns maybe-sheep.subs
    (:require [re-frame.core :refer [reg-sub subscribe]]))

(defn reverse-cmp 
    [a b]
    (compare a b))

(reg-sub
    :active-page 
    (fn [db _]
        (->> (:articles db)
             (vals)
             (sort-by :epoch reverse-cmp))))
