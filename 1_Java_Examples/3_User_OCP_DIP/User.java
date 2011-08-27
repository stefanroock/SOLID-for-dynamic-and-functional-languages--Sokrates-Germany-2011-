public class User {
	
	private long id;
	private String name;
	
	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Faked save method that should be sufficient for the example.
	 */
	public void save() {
		System.out.println("Save User " + getName() + " with ID " + getID());
	}
	
	/**
	 * Faked load method that should be sufficient for the example.
	 */
	public static User load(long id) {
		System.out.println("Load User with ID " + id);
		return new User(id, "user with id " + id);
	}
	
	private long getID() {
		return this.id;
	}
	
}
