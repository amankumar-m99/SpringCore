package p10BeanScope.p2SettingBeanScope.p2UsingXML;

public class Person {
	private int id;
	private String name;
	private String address;
	
	public Person() {
		super();
		System.out.println("default constructor Person() called");
	}
	public Person(int id, String name, String address) {
		super();
		System.out.println("parameterized constructor Person() called");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
