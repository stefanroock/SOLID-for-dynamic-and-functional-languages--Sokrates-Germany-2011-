require 'rectangle'

class Square < Rectangle
	
	def initialize x, y, side_length
		super(x, y, side_length, side_length)
	end
	
	def set_side_lengths horizontal_length, vertical_length
		if horizontal_length != vertical_length
			 throw Exception.new("For squares, both sides have to have equal lengths.")
		end
		super.set_side_lengths(horizontal_length, vertical_length)
	end
	
end