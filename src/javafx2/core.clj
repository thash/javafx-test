(ns javafx2.core
  (:require [clojure.java.io :as io])
  (:import (java.text SimpleDateFormat)
           (javafx.application Application)
           (javafx.event ActionEvent EventHandler)
           (javafx.fxml FXMLLoader)
           (javafx.scene Scene)
           (javafx.scene.control Button)
           (javafx.scene.layout StackPane)
           (javafx.scene.control TextField)
           (javafx.stage Stage)
           (eu.schudt.javafx.controls.calendar DatePicker)))

(gen-class
 :name Hello
 :main true
 :prefix "app-"
 :extends javafx.application.Application)

(defn app-start [this ^Stage stage]

;;  (let [eh (proxy [EventHandler] []
;;             (handle [_]
;;               (println "Hello World")))
;;        btn (doto (Button.)
;;                  (.setText "Say 'Hello World'")
;;                  (.setOnAction eh))
;;        fromDate (doto (DatePicker.)
;;                       (.setDateFormat (SimpleDateFormat. "yyyy/MM/dd"))
;;                       (.. getStylesheets (add "css/DatePicker.css"))
;;                       (.. getCalendarView todayButtonTextProperty (set "Today"))
;;                       (.. getCalendarView (setShowWeeks false)))]

 (let [pane (-> "../resources/layout.fxml" io/resource FXMLLoader/load)]
   (doto stage
     (.setTitle "Hello Wrold!")
     (.setScene (Scene. pane))
     .show)))

(defn -main
  [& args]
  (Application/launch (Class/forName "Hello") (into-array String [])))

