package p05LifecycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p05LifecycleMethods.sp1UsingXML.Laptop;
import p05LifecycleMethods.sp2UsingInterface.Keyboard;
import p05LifecycleMethods.sp3UsingAnnotation.Mouse;

public class MainLifecycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("p5LifecycleMethods/config.xml");
//		context.registerShutdownHook(); // registering shutdown hook
		Laptop laptop1 = (Laptop) context.getBean("laptop1");
		System.out.println(laptop1);
		System.out.println("-------------------------------------------------");
		Keyboard keyboard = (Keyboard) context.getBean("keyboard1");
		System.out.println(keyboard);
		System.out.println("-------------------------------------------------");
		Mouse mouse = (Mouse) context.getBean("mouse1");
		System.out.println(mouse);
		context.close();  
	}
}
