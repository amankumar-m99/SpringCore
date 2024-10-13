package p10BeanScope.p1Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p10BeanScope/p1Singleton/config.xml");
		
		Person person1 = context.getBean("person", Person.class);
		System.out.println("person1 hashcode: "+person1.hashCode());
		System.out.println("-------------------------------------");
		Person person2 = context.getBean("person", Person.class);
		System.out.println("person2 hashcode: "+person2.hashCode());
		((ClassPathXmlApplicationContext)context).close();
		//ApplicationContext does not has close() method hence type casting required.
	}
}
/*
default constructor called only once.
Now same object is returned for every request made.
*/