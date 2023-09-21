package p10BeanScope.p2SettingBeanScope.p1UsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p10BeanScope/p2SettingBeanScope/p1UsingAnnotation/config.xml");
				
		Person person1 = context.getBean("person", Person.class);
		System.out.println("person1 hashcode: "+person1.hashCode());
		System.out.println("-------------------------------------");
		Person person2 = context.getBean("person", Person.class);
		System.out.println("person2 hashcode: "+person2.hashCode());
	}
}
/*
Default constructor called twice once for each object.
Now new object is returned for every request made.
*/