(def find-customer-by-name [customers name]
	(some customers (= name (:name customer))))
