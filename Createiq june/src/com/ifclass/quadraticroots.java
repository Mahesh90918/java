package com.ifclass;

public class quadraticroots {
	public static void main(String[] args) {
		int a = 8;
		int b = -4;
		int c = -2;
		double discriminant = (b * b) - (4 * a * c);
		double root1, root2, imaginary;
		if (discriminant > 0) {
			root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			root2 = ((-b - Math.sqrt(discriminant)) /( 2 * a));
			System.out.println("root1 1 :" + root1);
			System.out.println("root2  2:" + root2);
		} else if (discriminant == 0) {
			root1 = root2 = -b /( 2 * a);
			System.out.println("root1  :" + root1);
			System.out.println("root2  :" + root2);
		} else if (discriminant < 0) {
			root1 = -b / (2 * a);
			root2 = -b / (2 * a);
			imaginary = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("root1  :" + root1);
			System.out.println("root2  :" + root2);
			System.out.println("imiginary :"+imaginary);
		}

	}
}
