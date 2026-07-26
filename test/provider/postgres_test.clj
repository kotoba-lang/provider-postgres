(ns provider.postgres-test
  (:require [clojure.test :refer [deftest is]]
            [provider.postgres.pool]))

;; Load gate: the split must not break namespace resolution. Each extracted
;; namespace must load standalone from this repo's own dependency closure.
(deftest every-extracted-namespace-loads
  (is (some? (find-ns 'provider.postgres.pool)) "provider.postgres.pool must load"))
