package p02CollectionTypeInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<String> friends;
	private Set<String> subjects;
	private Map<String, Integer> marks;

	public Student() {
	}

	public Student(int id, String name, List<String> friends, Set<String> subjects, Map<String, Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.friends = friends;
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

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}	
}
