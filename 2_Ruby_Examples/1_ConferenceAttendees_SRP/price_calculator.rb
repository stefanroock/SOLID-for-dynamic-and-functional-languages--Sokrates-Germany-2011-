require 'attendee'
require 'attendee_type'

class PriceCalculator
	
	REGULAR_PRICE = 1000
	
	def calculatePrice attendee
		if attendee.type == AttendeeType::SPEAKER
			REGULAR_PRICE / 2
		elsif attendee.type == AttendeeType::ORGANIZER
			0
		elsif attendee.type == AttendeeType::PARTICIPANT
			REGULAR_PRICE
		end
	end
	
end
