package p04ConstructorInjection;

public class Certificate {
	private String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
}
