package p03ReferenceTypeInjection;

public class ClsA {
	private int a;
	private ClsB clsB;
	public ClsA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public ClsB getClsB() {
		return clsB;
	}
	@Override
	public String toString() {
		return "ClsA [a=" + a + ", clsB=" + clsB + "]";
	}
	public void setClsB(ClsB clsB) {
		this.clsB = clsB;
	}
}
