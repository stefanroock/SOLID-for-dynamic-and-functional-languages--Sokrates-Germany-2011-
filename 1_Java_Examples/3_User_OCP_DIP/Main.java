public class Main {
	
	public static void main(String[] args) {
		User stefan = new User(1, "Stefan");
		stefan.save();
		User stefan_loaded = User.load(1);
	}
	
}