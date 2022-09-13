package Exceptionpropagation;

public class example3 {
	public double m1(double a, double b) {
		if (a != 0 && b != 0) {
			return a/b;
		
		} else {
			return 0;
		}
	}

	public double m2(double a, double b) {
		try {
			return a/b;
		}catch(ArithmeticException e) {
			return 0;
		}
	}public static void main(String[] args) {
		example3 e= new example3();
		System.out.println(e.m1(01, 011));
		System.out.println(e.m2(2, 4));
	}
}
