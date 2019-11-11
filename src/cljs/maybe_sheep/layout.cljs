(ns maybe-sheep.layout
  (:require [maybe-sheep.routing :refer [path-for]]
            [reagent.session :as session]
            [maybe-sheep.articles.article-content :refer [content-store]]))

(path-for :about)
(path-for :posts)
(path-for :post)

(defn home-page []
  (fn []
    [:span.main
     [:h1.avenir "Welcome to maybe-sheep"]
     [:ul
      [:li [:a {:href (path-for :posts)} "Items of maybe-sheep"]]
      [:li [:a {:href "/broken/link"} "Broken link"]]]]))


(def content-list (get-in content-store [:content]))


; (defn items-page []
;   (fn []
;     [:span.main
;      [:h1 "The items of maybe-sheep"]
;      [:ul (map (fn [content-list]
;                  [:li {:name (:title content-list) :key (str "item-" item-id)}
;                   [:a {:href (path-for :post {:post-id item-id})} "Item: " item-id]])
;                (range 1 60))]]))


(defn posts-page []
  (fn []
    [:span.main
     [:h1 "The items of maybe-sheep"]
     (for [item content-list]
       (let [kw (first item)
             data (second item)]
         ^{:key kw}
         [:div
          [:div (data :title)]
          [:a {:href (:url data)}]]))]))


(defn post-page []
  (fn []
    (let [routing-data (session/get :route)
          item (get-in routing-data [:route-params :post-id])]
      [:span.main
       [:h1 (str "Item " item " of maybe-sheep")]
       [:p [:a {:href (path-for :posts)} "Back to the list of items"]]])))


(defn about-page []
  (fn [] [:span.main
          [:h1 "About maybe-sheep"]]))