(ns javafx2.core
  (:import (javafx.application Application)
           (javafx.event ActionEvent EventHandler)
           (javafx.scene Scene)
           (javafx.scene.control Button)
           (javafx.scene.layout StackPane)
           (javafx.stage Stage)))

(gen-class
 :name HelloWorld
 :main true
 :extends javafx.application.Application)

(defn -start
  [this ^Stage stage]
  (let [eh (proxy [EventHandler] []
             (handle [_]
               (println "Hello World")))
        btn (doto (Button.)
              (.setText "Say 'Hello World'")
              (.setOnAction eh))
        root (StackPane.)
        _ (.. root getChildren (add btn))]
    (doto stage
      (.setTitle "Hello Wrold!")
      (.setScene (Scene. root 300 250))
      .show)))

(defn -main
  [& args]
  (Application/launch (Class/forName "HelloWorld") (into-array String [])))

