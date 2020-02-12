(ns maybe-sheep.routing
  (:require-macros [secretary.core :refer [defroute]])
  (:import [goog History]
           [goog.history EventType])
  (:require
   [secretary.core :as secretary]
   [goog.events :as gevents]
   [re-frame.core :as re-frame]
   [maybe-sheep.events :as events]
   ))

(defn hook-browser-navigation! []
  (doto (History.)
    (gevents/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")
  ;; --------------------
  ;; define routes here
  (defroute "/" []
    (re-frame/dispatch [::events/set-active-panel :home-panel])
    )

  (defroute "/about" []
    (re-frame/dispatch [::events/set-active-panel :about-panel]))

  (defroute "/posts" []
    (re-frame/dispatch [::events/set-active-panel :posts-panel]))
  (defroute "/misc" []
    (re-frame/dispatch [::events/set-active-panel :misc-panel]))
  (defroute "/how-code" []
    (re-frame/dispatch [::events/set-active-panel :how-code-panel]))
  (defroute "/how-fp" []
    (re-frame/dispatch [::events/set-active-panel :how-fp-panel]))
  (defroute "/hoon-school-week-1" []
    (re-frame/dispatch [::events/set-active-panel :hoon-school-week-1-panel]))
  (defroute "/why-programming-is-hard" []
    (re-frame/dispatch [::events/set-active-panel :why-hard-panel]))
  ; (defroute "/posts" []
  ;   (re-frame/dispatch [::events/set-active-panel :posts-panel]))
  ; (defroute "/posts" []
  ;   (re-frame/dispatch [::events/set-active-panel :posts-panel]))
  ; (defroute "/posts" []
  ;   (re-frame/dispatch [::events/set-active-panel :posts-panel]))


  ;; --------------------
  (hook-browser-navigation!))