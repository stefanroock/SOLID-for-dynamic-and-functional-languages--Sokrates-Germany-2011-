public class Main {
	
	public static main(String[] args) {
		Attendee participant = new Attendee("Stefan", AttendeeType.Participant);
		Attendee speaker = new Attendee("Markus", AttendeeType.Speaker);
		Attendee organizer = new Attendee("Andreas", AttendeeType.Organizer);
		System.out.println("Price for regular participant: " + new PriceCalculator.calculatePrice(participant)));
		System.out.println("Price for speaker: " + new PriceCalculator.calculatePrice(speaker)));
		System.out.println("Price for organizer: " + new PriceCalculator.calculatePrice(organizer)));
	}
	
}
