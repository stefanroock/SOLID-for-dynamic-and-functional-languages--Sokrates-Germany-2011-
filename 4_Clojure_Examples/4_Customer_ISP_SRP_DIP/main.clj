(def customers
	[(make-customer 1 "Stefan Roock", "Paul-Stritter-Weg 5", 22297, "Hamburg")
	 (make-customer 2 "Henning Wolf", "Paul-Stritter-Weg 5", 22297, "Hamburg")
	 (make-customer 3 "Stefan Huber", "Biergartenweg 21", 88888, "München")])

(def found-customers (find-customer-by-name customers "Stefan Roock"))
(map customers (print-customer-address-on-envelope customer))
