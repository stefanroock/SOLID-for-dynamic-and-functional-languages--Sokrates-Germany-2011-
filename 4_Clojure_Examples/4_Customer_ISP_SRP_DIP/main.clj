(use 'customer)
(use 'customer_printer)
(use 'customer_search)

(def customers
	[(make-customer 1 "Stefan Roock", "Paul-Stritter-Weg 5", 22297, "Hamburg")
	 (make-customer 2 "Henning Wolf", "Paul-Stritter-Weg 5", 22297, "Hamburg")
	 (make-customer 3 "Stefan Huber", "Biergartenweg 21", 88888, "Munic")])

(def found-customers (find-customer-by-name customers "Stefan Roock"))
(dorun (map print-customer-address-on-envelope found-customers))
