(ns clojure-noob.core
  (:gen-class))

(defn getDiscount [cost discountRate] ( * (/ discountRate 100.0) cost))

(defn getAffordability [income premium]  (> (* (/ premium income) 100.0) 5))

(defn filterSelectedProducts [products](filter (fn[p](get p :selected)) products))

(defn -main
  "I am the three eyed price man :)"
  [& args]
  (def productSelection [{:title 'Family' :selected true} {:title 'Household' :selected false} {:title 'Remu' :selected true}])
  (def selectedProducts (filterSelectedProducts productSelection))
  (println "")
  (println "")
  (println "The products are coming ")
  (println productSelection))
  (println "")
  (println "A product is not a slave")
  (println selectedProducts)
