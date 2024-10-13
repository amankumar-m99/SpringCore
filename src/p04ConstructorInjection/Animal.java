package p04ConstructorInjection;

public class Animal {
	private String name;
	private double age;
	private String constructor;
	
	public Animal(String name, double age) {
		this.name = name;
		this.age = age;
		constructor = "double";
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		constructor = "int";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", constructor=" + constructor + "]";
	}
	
}
