package p07StandAloneCollection;

import java.util.List;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	private List<String> subjects;
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
