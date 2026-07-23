(ns statute.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [statute.facts :as facts]))

(deftest rou-has-spec-basis
  (let [sb (facts/spec-basis "ROU")]
    (is (= 3 (count sb)))
    (is (every? #(str/starts-with? (:statute/url %) "https://") sb))
    (is (every? :statute/law-number sb))))

(deftest unknown-jurisdiction-has-no-spec-basis
  (is (nil? (facts/spec-basis "ATL")))
  (is (nil? (facts/spec-basis "ZZZ"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["ROU" "POL" "ATL"])]
    (is (= 3 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["ATL" "POL"] (:missing-jurisdictions c)))))

(deftest by-topic-filters
  (is (= ["rou.legea-190-2018-gdpr-implementing-measures"]
         (mapv :statute/id (facts/by-topic "ROU" :privacy))))
  (is (= ["rou.legea-53-2003-codul-muncii"]
         (mapv :statute/id (facts/by-topic "ROU" :labor))))
  (is (= ["rou.legea-31-1990-legea-societatilor"]
         (mapv :statute/id (facts/by-topic "ROU" :incorporation))))
  (is (empty? (facts/by-topic "ATL" :privacy))))
