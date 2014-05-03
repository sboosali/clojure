(ns prolog.core
 (:use [clojure.core.logic :only [run* membero]])
 (:gen-class))

(def Qs
 (run* [Q]
  (membero Q [1 2 3])
  (membero Q [2 3 4])))

(defn -main [& args]
 (println "Q ==" Qs))
