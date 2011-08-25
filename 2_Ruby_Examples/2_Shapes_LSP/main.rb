require 'square'

def scale rectangle, horizontal_scale_factor, vertical_scale_factor
	rectangle.set_side_lengths(rectangle.horizontal_length * horizontal_scale_factor, rectangle.vertical_length * vertical_scale_factor)
end

rectangle = Rectangle.new(0,0,10,20)
square = Square.new(0,0,10)
scale(rectangle,2,3)
scale(square,2,3)
