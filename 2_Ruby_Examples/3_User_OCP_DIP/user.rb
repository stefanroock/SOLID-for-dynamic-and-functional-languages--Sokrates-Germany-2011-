class User

	attr_accessor :id, :name
	
	def initialize id, name
		@id = id
		@name = name
	end
	
	
	# Faked save method that should be sufficient for the example.
	def save
		puts "Save User #{@name} with ID #{@id}"
	end
	
	# Faked load method that should be sufficient for the example.
	def User::load id
		puts "Load User with ID #{id}"
		User.new(id, "user with id #{id}")
	end
	
end
