(ns user
  (:require [nextjournal.clerk :as clerk]))

;; Serve all clj and md files in src dir as clerk notebooks
(clerk/serve! {:browse? true :watch-paths ["src"]})

^{::clerk/visibility {:code :hide :result :hide}}
(comment
  :rcf)
