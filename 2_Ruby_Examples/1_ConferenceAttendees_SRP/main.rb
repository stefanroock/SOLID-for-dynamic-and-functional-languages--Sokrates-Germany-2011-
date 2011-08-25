require 'price_calculator'

participant = Attendee.new("Stefan", AttendeeType::PARTICIPANT)
speaker = Attendee.new("Markus", AttendeeType::SPEAKER)
organizer = Attendee.new("Andreas", AttendeeType::ORGANIZER)
puts "Price for regular participant: #{PriceCalculator.new.calculatePrice(participant)}"
puts "Price for speaker: #{PriceCalculator.new.calculatePrice(speaker)}"
puts "Price for organizer: #{PriceCalculator.new.calculatePrice(organizer)}"
