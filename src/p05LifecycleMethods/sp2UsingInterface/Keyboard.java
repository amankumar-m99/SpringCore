package p05LifecycleMethods.sp2UsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Keyboard implements InitializingBean, DisposableBean{
	private double price;

	public Keyboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Keyboard [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// it is init() method as its called after setting properties
		System.out.println("Keyboard init() using interface");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Keyboard destroy() using interface");
	}
	

}
