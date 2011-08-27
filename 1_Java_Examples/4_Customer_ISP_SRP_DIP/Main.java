import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		List<Customer> customers = createCustomers();
		
		CustomerSearch search = new CustomerSearch();
		search.setCustomerBase(customers);
		List<Customer> foundCustomers = search.findByName("Stefan");
		Iterator<Customer> iterator = foundCustomers.iterator();
		CustomerPrinter printer = new CustomerPrinter();
		while (iterator.hasNext()) {
			printer.printAddressOnEnvelope(iterator.next());
		}
	}
	
	private static List<Customer> createCustomers() {
		Customer c1 = new Customer(1, "Stefan Roock", "Paul-Stritter-Weg 5", 22297, "Hamburg");
		Customer c2 = new Customer(2, "Henning Wolf", "Paul-Stritter-Weg 5", 22297, "Hamburg");
		Customer c3 = new Customer(3, "Stefan Huber", "Biergartenweg 21", 88888, "München");
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		return customers;
	}
	
}