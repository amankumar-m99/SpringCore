package p5LifecycleMethods.sp1UsingXML;

public class Laptop {
	private double price;
	
	public Laptop() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting laptop price property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside laptop init()");
	}

	public void destroy() {
		System.out.println("Inside laptop destroy()");
	}
}
