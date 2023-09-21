package p6Autowiring.s1UsingXml;

public class Employee {
	private Address address;

	public Employee() {
		super();
		System.out.println("Default constructor of employee called");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Parameterized constructor of employee called");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address in employee");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
}
