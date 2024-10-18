package p11Spel.p1StaticMethod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StaticMethodDemo {

	// Calling static variable T(<class name>).<variable name>(<arguments>)
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int x;
	
	// Calling static method T(<class name>).<method name>(<arguments>)
	@Value("#{T(java.lang.Math).pow(3,2)}")
	private int sq;

	// Creating new objects <class>
	@Value("#{new java.lang.String('aman static name')}")
	private String name;

	//Boolean
	@Value("#{13>7}")
	private boolean isActive;

	public StaticMethodDemo() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getSq() {
		return sq;
	}

	public void setSq(int sq) {
		this.sq = sq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "StaticMethodDemo [x=" + x + ", sq=" + sq + ", name=" + name + ", isActive=" + isActive + "]";
	}
}
