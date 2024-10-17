package p05LifecycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p05LifecycleMethods.sp1UsingXML.Laptop;
import p05LifecycleMethods.sp2UsingInterface.Keyboard;
import p05LifecycleMethods.sp3UsingAnnotation.Mouse;

public class MainLifecycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("p05LifecycleMethods/config.xml");
		context.registerShutdownHook(); // registering shutdown hook
//		ApplicationContext context = new ClassPathXmlApplicationContext("p05LifecycleMethods/config.xml");
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
/*
NOTE:
1. AbstractApplicationContext is used here instead of ApplicationContext, AbstractApplicationContext does not has registerShutdownHook() method.
2. Without using registerShutdownHook() method, destroy life-cycle hooks are called only just before calling of close() on context if called.
3. If close() method is not called on context then registerShutdownHook() needs to be called for invoking destroy hook.
*/