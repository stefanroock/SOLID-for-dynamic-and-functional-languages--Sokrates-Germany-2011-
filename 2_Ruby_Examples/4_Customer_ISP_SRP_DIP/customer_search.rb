require 'customer'

class CustomerSearch 
	
	attr_accessor :customers
	
	def find_by_name name
		@customers.find_all{|customer| customer.name.start_with? name}
	end
	
end
