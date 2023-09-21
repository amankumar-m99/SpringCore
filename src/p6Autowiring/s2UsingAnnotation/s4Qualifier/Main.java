package p6Autowiring.s2UsingAnnotation.s4Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p6Autowiring/s2UsingAnnotation/s4Qualifier/config.xml");
//		Employee employee = (Employee) context.getBean("employee");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
