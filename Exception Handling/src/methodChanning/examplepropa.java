package methodChanning;

public class examplepropa {
// method chaining
	public void m1() {
		System.out.println("m1");
		m2();
		System.out.println("m2");
	}

	public void m2() {
		System.out.println(10/0);
		System.out.println("m222");
	}public static void main(String[] args) {
		examplepropa p =new examplepropa();
		p.m1();
	}
}
