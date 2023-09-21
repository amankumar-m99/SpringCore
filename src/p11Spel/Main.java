package p11Spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("p11Spel/config.xml");
		SpelDemo spelDemo = context.getBean("spelDemo", SpelDemo.class);
		System.out.println(spelDemo);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("13+23");
		System.out.println(expression.getValue());
	}
}
