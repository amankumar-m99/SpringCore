package p06Autowiring.s2UsingAnnotation.s2OnSetter;

import org.springframework.beans.factory.annotation.Autowired;

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

	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter address called in employee");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
}
