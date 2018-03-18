(ns clojure-noob.core
  (:gen-class))

(defn bothPass [conditionFunc1 conditionFunc2 obj](and (conditionFunc1 obj) (conditionFunc2 obj)))

(defn select
    [key obj]
    (get obj key)
)

(defn -main
  "I am the three eyed price man"
  [& args]
  
  (defn isTeeny [doggo](= (get doggo :size) "teeny"))

  (defn isDoggor [doggo](= (get doggo :type) "DOGGOR"))

  (defn isGender [doggo](if (= (get doggo :gender) "F") "She" "He"))
  
 
  (def doggos [
    {:gender "F" :name "Missy" :type "floofer" :size "teeny" }
    {:gender "F" :name "Billy" :type "pupper" :size "bitey"}
    {:gender "M" :name "Mixie" :type "DOGGOR" :size "teeny"}
    {:gender "F" :name "Boxer" :type "Huge Borker" :size "Mambo Jambo"}
    {:gender "M" :name "Alice" :type "Doge" :size "miny"}
    {:gender "F" :name "Vulcan" :type "DOGGOR" :size "Alpha"}
    {:gender "M" :name "Mr beans" :type "Huge Borker" :size "Alpha"}
    {:gender "F" :name "Scentwell" :type "DOGGOR" :size "teeny"}
  ])

  (defn describe [doggo](str " a " (get doggo :size) " " (get doggo :type)))


  ;;;;;;;;;;; Content
  (defn greet [doggo](str "\n Meet " (get doggo :name)))

  (defn specify [doggo](str (isGender doggo) " is"))

  (defn tellAbout [doggo](str (greet doggo) " " (specify doggo) " " (describe doggo) "\n"))

  (defn howMany 
    [type doggos]
      (count (filter (fn[doggo](= type (get doggo :type))) doggos))  
  )
  
  ;;;;;;;;;;;; Output
  (println "---")
  (def stories (map tellAbout doggos))
  (println stories)
  (println "We have")
  (def doggoTypes (distinct (map (partial select :type) doggos)))
  (def ourDoggos (map (fn[type](str (howMany type doggos) " " type "\n")) doggoTypes))
  (println ourDoggos)
  (println "---")

)
