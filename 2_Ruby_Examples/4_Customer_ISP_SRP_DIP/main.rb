require 'customer'
require 'customer_search'
require 'customer_printer'

def create_customers
  c1 = Customer.new(1, "Stefan Roock", "Paul-Stritter-Weg 5", 22297, "Hamburg")
  c2 = Customer.new(2, "Henning Wolf", "Paul-Stritter-Weg 5", 22297, "Hamburg")
	c3 = Customer.new(3, "Stefan Huber", "Biergartenweg 21", 88888, "München")
	[c1, c2, c3]
end
	
customers = create_customers
search = CustomerSearch.new
search.customers = customers
found_customers = search.find_by_name("Stefan")
printer = CustomerPrinter.new
found_customers.each{|customer| printer.print_address_on_envelope(customer)}
