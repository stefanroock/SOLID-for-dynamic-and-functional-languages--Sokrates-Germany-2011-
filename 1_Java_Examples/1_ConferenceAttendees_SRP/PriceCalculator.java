public class PriceCalculator {
	
	private static int REGULAR_PRICE = 1000;
	
	public int calculatePrice(Attendee attendee) {
		switch (attendee.getType()) {
			case Speaker: return REGULAR_PRICE / 2;
			case Organizer: return 0;
			case Participant: return REGULAR_PRICE;
			default: throw new IllegalStateException();
		}
	}
	
}