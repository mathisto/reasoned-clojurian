(ns reasoned-schemer.reasoned-schemer
  "The Reasoned Clojurian")

(defn exec
  "Invoke me with clojure -X reasoned-schemer.reasoned-schemer/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "Invoke me with clojure -M -m reasoned-schemer.reasoned-schemer"
  [& args]
  (println "-main with" args))
