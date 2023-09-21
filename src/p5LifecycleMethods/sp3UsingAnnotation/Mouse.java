package p5LifecycleMethods.sp3UsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mouse {
	private double price;

	public Mouse() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mouse [price=" + price + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Mouse start() using annotaion");
	}

	@PreDestroy
	public void end() {
		System.out.println("Mouse end() using annotation");
	}
}
