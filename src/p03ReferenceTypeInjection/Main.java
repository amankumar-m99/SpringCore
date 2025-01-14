package p03ReferenceTypeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p03ReferenceTypeInjection/config.xml");
		ClsA a = (ClsA) context.getBean("clsARef");
		System.out.println(a);
		((ConfigurableApplicationContext)context).close();
	}
}
