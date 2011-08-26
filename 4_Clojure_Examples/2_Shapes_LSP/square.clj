(defn make-square [x y side-length]
	(make-rectangle x y side-length side-length))

über defmulti und defmethod?
		
	def set_side_lengths horizontal_length, vertical_length
		if horizontal_length != vertical_length
			 throw Exception.new("For squares, both sides have to have equal lengths.")
		end
		super.set_side_lengths(horizontal_length, vertical_length)
	end
	
end