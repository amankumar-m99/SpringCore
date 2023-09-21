package p6Autowiring.s1UsingXml.s3ByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p6Autowiring.s1UsingXml.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p6Autowiring/s1UsingXml/s3ByConstructor/config.xml");
//		Employee employee = (Employee) context.getBean("employee");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
