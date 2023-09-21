package p9StereotypeAnnotationCollectionUsingValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p9StereotypeAnnotationCollectionUsingValueAnnotation/config.xml");
		
		//If not provided any name in @Component() annotation then the name of the bean will be as the name of the class in camelCase.
		Student student = context.getBean("student", Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getSubjects().getClass());
		System.out.println(student.getSubjects());
		System.out.println(student.getMarks().getClass());
		System.out.println(student.getMarks());
	}
}
 