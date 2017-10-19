(ns clojure-noob.core
  (:gen-class))

(defn getDiscount [cost discountRate] ( * (/ discountRate 100.0) cost))

(defn getAffordability [income premium]  (> (* (/ premium income) 100.0) 5))

(defn filterSelectedProducts [products](filter (fn[p](get p :selected)) products))

(defn -main
  "I am the three eyed price man :)"
  [& args]
  (def productSelection [{:title 'sim-family' :selected true} {:title 'sim-employee' :selected false} {:title 'sim-cashback' :selected true}])
  (def selectedProducts (filterSelectedProducts productSelection))
  (println "")
  (println "")
  (println "The products are coming ")
  (println productSelection))
  (println "")
  (println "A product is not a slave")
  (println selectedProducts)




  ;;(def premium  (getPremium selectedProducts))
  ;;(def ropPremium (- premiumWithRop premium)
  ;;( if (pricingConfig.withRop)
  ;;     (def ropCost ropPremium)
  ;;     (def ropCost  0)
  ;;)
  ;;(def ropPrecentage ROP_PERCENTAGE)
  ;;(def cost (+ premium ropCost)
  ;;(def discountAmount ( getDiscount cost pricingConfig.discountRate)
  ;;(def finalCost (- cost  discountAmount)
  ;;(def discountedPremiumNoRop (- premium  (getDiscount premium pricingConfig.discountRate)))
  ;;(def ropReturn (getRopReturn discountedPremiumNoRop ROP_PERCENTAGE)
  ;;(def ropTotalPremium (totalPremiumOverFiveYears ropPremium))
  ;;(def isAffordable (getAffordability income finalCost)
