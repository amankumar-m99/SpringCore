package p11Spel.p1StaticMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p11Spel/config.xml");
		StaticMethodDemo demo = context.getBean("staticMethodDemo", StaticMethodDemo.class);
		System.out.println(demo);
	}
}
