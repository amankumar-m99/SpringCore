package p1SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("p1SetterInjection/config.xml");
		Student s1 = (Student) context.getBean("student1");
		System.out.println("Hash: "+ s1.hashCode() + " | "+s1);
		Student s2 = (Student) context.getBean("student2");
		System.out.println("Hash: "+ s2.hashCode() + " | "+s2);
		Student s3 = (Student) context.getBean("student3");
		System.out.println("Hash: "+ s3.hashCode() + " | "+s3);
		((ConfigurableApplicationContext)context).close();
	}
}
