(ns wire.preds)

(defrecord Norm [norm-id])
(defrecord CountsAs [abstract-fact context concrete-fact])
(defrecord Activation [norm formula])
(defrecord Expiration [norm formula])
(defrecord Maintenance [norm formula])
(defrecord Predicate [name argument-0 argument-1 argument-2 argument-3
                      argument-4 argument-5 argument-6 argument-7 argument-8 
                      argument-9 argument-10 argument-11 argument-12])
(defrecord AbstractFact [norm formula])
(defrecord Holds [formula substitution])
(defrecord HasClause [formula clause])
(defrecord Event [asserter content])
(defrecord Formula [content grounding])
(defrecord Instantiated [norm substitution])
(defrecord Fulfilled [norm substitution])
(defrecord Violated [norm substitution])
(defrecord Repaired [norm substitution])
(defrecord SubsetEQ [subset superset])
(defrecord Repair [norm repair-norm])

