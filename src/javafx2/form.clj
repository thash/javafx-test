(ns javafx2.form
  (:import (java.text SimpleDateFormat)
           (javafx.application Application)
           (javafx.event ActionEvent EventHandler)
           (javafx.scene Scene)
           (javafx.scene.control Button)
           (javafx.scene.layout StackPane GridPane)
           (javafx.scene.control TextField)
           (javafx.stage Stage))
  (:gen-class
     :name "MyForm"
     :main true
     :extends javafx.application.Application))

(defn -start [this ^Stage stage]
  (let [grid (doto (GridPane.)
                   ;(.setAlignment (.CENTER Position))
                   (.setHgap 10)
                   (.setVgap 10)
                   ;;(.setPadding (Insets. 25 25 25 25))
               )
        scene (Scene. grid 600 600)]
    (doto stage
      (.setTitle "JavaFX Welcome")
      (.setScene scene)
      .show)))

(defn -main [& args]
  (Application/launch (Class/forName "MyForm") (into-array String [])))
