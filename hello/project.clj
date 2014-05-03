(defproject hello "0.1.0"
  :description "hello world for Clojure under Leiningen"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot hello.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
