class Rectangle
	
	attr_accessor :horizontal_length, :vertical_length
	
	def initialize x, y, horizontal_length, vertical_length
		@x = x;
		@y = y;
		@horizontal_length = horizontal_length;
		@vertical_length = vertical_length;
	end
	
	def compute_area
		@horizontal_length * @vertical_length;
	end
	
	def compute_perimenter
		@horizontal_length * 2 + @vertical_length * 2;
	end
	
	def set_side_lengths horizontal_length, vertical_length
		@horizontal_length = horizontal_length;
		@vertical_length = vertical_length;
	end
	
end

