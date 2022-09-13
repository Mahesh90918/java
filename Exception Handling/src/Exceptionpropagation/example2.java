package Exceptionpropagation;

public class example2 {
	public void m1() {
		System.out.println("m1");
		m2();
		System.out.println("m2");
	}

	public void m2() {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("m222");
	}

	public static void main(String[] args) {
		example2 p = new example2();
		p.m1();
	}

}
