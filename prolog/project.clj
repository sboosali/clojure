(defproject prolog "0.1.0"
  :description ""
  :url ""

  :main ^:skip-aot prolog.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :dependencies [[org.clojure/core.logic "0.8.7"]
                 [org.clojure/clojure "1.5.1"]])
