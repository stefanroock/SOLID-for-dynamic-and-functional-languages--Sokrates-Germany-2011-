object PriceCalculator {
	def calculatePrice(attendee:Attendee):Int = {
          val REGULAR_PRICE = 1000
	  attendee.attendeeType match {
	    case AttendeeType.Participant => return REGULAR_PRICE
	    case AttendeeType.Speaker => return REGULAR_PRICE / 2
	    case AttendeeType.Organizer => return 0
	    case _ => throw new IllegalStateException()
	  }
	}
}
