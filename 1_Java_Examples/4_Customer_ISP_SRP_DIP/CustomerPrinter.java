public class CustomerPrinter {
	
	public printAddressOnEnvelope(Customer c) {
		System.out.println(c.getName());
		System.out.println(c.getStreet());
		System.out.println(c.getZipCode() + " " + c.getCity());
	}
	
}