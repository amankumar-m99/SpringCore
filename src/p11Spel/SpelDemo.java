package p11Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {
	@Value("#{1+23}")
	private int x;
	private int y;
	public SpelDemo() {
		super();
		System.out.println("Default constructor SpelDemo() called");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + "]";
	}
}
