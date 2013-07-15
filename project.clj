(defproject javafx2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;; :repositories {"local" "/Users/hash/.m2/"}
  :repositories {"local" ~(str (.toURI (java.io.File. "maven-repo")))}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [local.oracle/jfxrt "2.2.3"]]
            :main javafx2.core)
