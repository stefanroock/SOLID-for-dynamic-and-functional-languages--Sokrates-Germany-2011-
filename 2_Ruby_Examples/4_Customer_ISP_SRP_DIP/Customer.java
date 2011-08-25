public class Customer {
	
	private long customerNumber;
	private String name;
	private String street, city;
	private int zipCode;
	
  public Customer(long customerNumber, String name, String street, int zipCode, String city) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	public long getCustomerNumber() {
		return this.customerNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public int getZipCode() {
		return this.zipCode;
	}
	
	public String getCity() {
		return this.city;
	}
	
}