package p11Spel.p1StaticMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p11Spel/config.xml");
		StaticMethodDemo demo = context.getBean("staticMethodDemo", StaticMethodDemo.class);
		System.out.println(demo);
		((ClassPathXmlApplicationContext)context).close();
		//ApplicationContext does not has close() method hence type casting required.
	}
}
