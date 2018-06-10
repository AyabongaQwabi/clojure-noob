(ns clojure-noob.core
  (:gen-class)
  (use clojure.pprint)
  (require [clojure.string :as str]))

(defn splitByComa [strArr] 
      (str/split strArr #","))

(defn readCsv [csvFileName] 
      (slurp csvFileName))

(defn makeObjectOf [objectKeys values]
      (def joinedKeyValuePair (interleave objectKeys values))
      (apply assoc {} joinedKeyValuePair))

(defn objectizeCsvSpread [csvSpread]
      (def lines (str/split csvSpread #"\n"))
      (def lineArrays (map splitByComa lines))
      (def objectKeys (map keyword (first lineArrays)))
      (defn objectize [arr] (makeObjectOf objectKeys arr))
      (def valueArrs (rest lineArrays))
      (map objectize valueArrs))

(defn -main
  "Peforms operations on CSV data."
  [& args]

  (def peepsCsv (readCsv "/Users/ayabongaqwabi/dev/clojure-noob/src/clojure_noob/peopl.csv"))
  (objectizeCsvSpread peepsCsv))


  