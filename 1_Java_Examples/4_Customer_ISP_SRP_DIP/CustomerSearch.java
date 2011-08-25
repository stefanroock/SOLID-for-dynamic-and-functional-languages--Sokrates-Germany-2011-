import java.util.List;

public CustomerSearch {
	
	private List<Customer> customers; 
	
	public void setCustomerBase(List<Customer> customers) {
		this.customers = customers;
	}
	
	public List<Customers> findByName(String name) {
		List<Customers> result = new ArrayList<Customer>();
		iterator = this.customers.iterator();
		while (iterator.hasNext()) {
			customer = iterator.next;
			if (customer.name.startsWith(name)) {
				result.add(customer);
			}
		}
		return customer;
	}
	
}