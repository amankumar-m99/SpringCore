package p08StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p8StereotypeAnnotation/config.xml");
		
		//If not provided any name in @Component() annotation then the name of the bean will be as the name of the class in camelCase.
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
		//If provided any name in @Component() annotation then the name of the bean will be as the name provided in the @Component annotation.
		Person person = context.getBean("myComponent", Person.class);
		System.out.println(person);

		((ClassPathXmlApplicationContext)context).close();
		//ApplicationContext does not has close() method hence type casting required.
	}
}
 