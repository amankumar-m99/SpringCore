package p6Autowiring.s2UsingAnnotation.s2OnSetter;

public class Address {
	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setter street called in address");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setter city called in address");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}
