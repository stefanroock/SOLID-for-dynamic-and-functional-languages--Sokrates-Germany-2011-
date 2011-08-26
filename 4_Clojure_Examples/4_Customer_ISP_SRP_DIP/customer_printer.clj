(def print-customer-address-on-envelope [customer]
	(println (:name customer))
	(println (:street customer))
	(println (str (:zip-code customer) (:city customer))))
