class Customer

	attr_accessor :customer_number, :name, :street, :zip_code, :city
	
  def initialize customer_number, name, street, zip_code, city
		@customer_number = customer_number
		@name = name
		@street = street
		@zip_code = zip_code
		@city = city
	end
	
end
