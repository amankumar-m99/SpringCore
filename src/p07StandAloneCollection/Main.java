package p07StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p7StandAloneCollection/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getSubjects().getClass());
		System.out.println(student.getSubjects());
		System.out.println(student.getMarks().getClass());
		System.out.println(student.getMarks());
		((ClassPathXmlApplicationContext)context).close();
		//ApplicationContext does not has close() method hence type casting required.
	}
}
