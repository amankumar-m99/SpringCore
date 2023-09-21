package p8StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Student {
	@Value("1001")
	private int id;
	@Value("Aman")
	private String name;

	public Student() {
		System.out.println("default constructor Student() called");
	}

	public Student(int id, String name) {
		super();
		System.out.println("parameterized constructor Student() called");
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
