public class Attendee {
	
	private String name;
	private AttendeeType type;

	public void Attendee(String name, AttendeeType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public AttendeeType getType() {
		return this.type;
	}
	
}