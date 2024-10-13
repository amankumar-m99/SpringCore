package p06Autowiring.s1UsingXml.s2ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p06Autowiring.s1UsingXml.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p6Autowiring/s1UsingXml/s2ByType/config.xml");
//		Employee employee = (Employee) context.getBean("employee");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);

		((ClassPathXmlApplicationContext)context).close();
		//ApplicationContext does not has close() method hence type casting required.
	}
}