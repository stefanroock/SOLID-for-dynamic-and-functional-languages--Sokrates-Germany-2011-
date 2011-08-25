public class Main {
	
	public void main(String[] args) {
		List<Customer> customers = createCustomers();
		
		CustomerSearch search = new CustomerSearch();
		search.setCustomerBase(customers);
		foundCustomers = search.findByName("Stefan");
		iterator = foundCustomers.iterator;
		CustomerPrinter printer = new CustomerPrinter();
		while (iterator.hasNext) {
			printer.printAddressOnEnvelope(iterator.next);
		}
	}
	
	private List<Customer> createCustomers() {
		Customer c1 = new Customer(1, "Stefan Roock", "Paul-Stritter-Weg 5", 22297, "Hamburg");
		Customer c2 = new Customer(2, "Henning Wolf", "Paul-Stritter-Weg 5", 22297, "Hamburg");
		Customer c3 = new Customer(3, "Stefan Huber", "Biergartenweg 21", 88888, "München");
		List<Customer> customers = new ArrayList<Customer>();
		customers.addAll(c1, c2, c3);
		return customers;
	}
	
}