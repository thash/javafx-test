(ns javafx2.core
  (:import (javafx.application Application)
           (javafx.event ActionEvent EventHandler)
           (javafx.scene Scene)
           (javafx.scene.control Button)
           (javafx.scene.layout StackPane)
           (javafx.scene.control TextField)
           (javafx.stage Stage))
  )

(gen-class
 :name Hello
 :main true
 :extends javafx.application.Application)

(defn -start
  [this ^Stage stage]
  (println (str "in -start"))
  (println (str *ns*))
  (let [eh (proxy [EventHandler] []
             (handle [_]
               (println "Hello World")))
        btn (doto (Button.)
              (.setText "Say 'Hello World'")
              (.setOnAction eh))
        fromDate (doto (TextField.))
        root (StackPane.)
        ;; _ (.. root getChildren (add btn))
        _ (.. root getChildren (add fromDate))
        ]
    (doto stage
      (.setTitle "Hello Wrold!")
      (.setScene (Scene. root 300 250))
      .show)))

(defn -main
  [& args]
(println (str "in -main"))
(println (str *ns*))
  (Application/launch (Class/forName "Hello") (into-array String [])))

