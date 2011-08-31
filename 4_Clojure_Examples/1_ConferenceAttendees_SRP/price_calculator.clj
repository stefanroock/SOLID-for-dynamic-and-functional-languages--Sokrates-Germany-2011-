(ns price_calculator)

(def REGULAR-PRICE 1000)

(defn calculate-price [attendee]
	(cond (= :participant (:type attendee)) REGULAR-PRICE
			  (= :speaker (:type attendee)) (/ REGULAR-PRICE 2)
			  (= :organizer (:type attendee)) 0))
