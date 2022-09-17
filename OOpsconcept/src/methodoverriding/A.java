package methodoverriding;

public class A {
	
	void animal() {
		System.out.println("rat");
	}int a;
	int b;
	protected A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println( "A [a=" + a + ", b=" + b + "]");
	}
	
}
