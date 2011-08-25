require 'customer'

class CustomerPrinter
	
	def print_address_on_envelope customer
		puts customer.name
		puts customer.street
		puts "#{customer.zip_code} #{customer.city}"
	end
	
end
