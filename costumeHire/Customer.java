package costumeHire;

public class Customer {
	private String name;
	private CustomerIdentifier id;

	public Customer(String name, String id)
	{
		this.name = name;
		this.id = new CustomerIdentifier(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Customer Ref#: " + this.id.getId() + ", " + getName();
	}

}
