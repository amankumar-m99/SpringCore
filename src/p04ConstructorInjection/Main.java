package p04ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p04ConstructorInjection/config.xml");
		Person person1 = (Person)context.getBean("person1");
		System.out.println(person1.toString());
		
		Person person2 = (Person)context.getBean("person2");
		System.out.println(person2.toString());

		Animal animal1 = (Animal) context.getBean("animal1");
		System.out.println(animal1);
		Animal animal2 = (Animal) context.getBean("animal2");
		System.out.println(animal2);

		((ConfigurableApplicationContext)context).close();
	}
}
