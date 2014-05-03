(ns hello.core
  (:gen-class))

(defn -main "docstring"  [& args]
  (println (format "Hello %s!" args)))
