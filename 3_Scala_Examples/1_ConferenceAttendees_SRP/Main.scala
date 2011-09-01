import PriceCalculator._

object Main {
    def main(args: Array[String]) {
	val participant = new Attendee("Stefan", AttendeeType.Participant)
	val speaker = new Attendee("Markus", AttendeeType.Speaker)
	val organizer = new Attendee("Andreas", AttendeeType.Organizer)
	System.out.println("Price for regular participant: " + PriceCalculator.calculatePrice(participant))
	System.out.println("Price for speaker: " + PriceCalculator.calculatePrice(speaker))
	System.out.println("Price for organizer: " + PriceCalculator.calculatePrice(organizer))
    }
}

