import java.util.*;

public class CustomerSearch {
	
	private List<Customer> customers; 
	
	public void setCustomerBase(List<Customer> customers) {
		this.customers = customers;
	}
	
	public List<Customer> findByName(String name) {
		List<Customer> result = new ArrayList<Customer>();
		Iterator<Customer> iterator = this.customers.iterator();
		while (iterator.hasNext()) {
			Customer customer = iterator.next();
			if (customer.getName().startsWith(name)) {
				result.add(customer);
			}
		}
		return result;
	}
	
}