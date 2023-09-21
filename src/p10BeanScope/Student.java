package p10BeanScope;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Student {
	@Value("1001")
	private int id;
	
	@Value("Aman")
	private String name;
	
	@Value("#{globalSubjects}")
	private List<String> subjects;
	
	@Value("#{globalMarks}")
	private Map<String, Integer> marks;

	public Student() {
	}

	public Student(int id, String name, List<String> subjects, Map<String, Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.marks = marks;
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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}	
}
