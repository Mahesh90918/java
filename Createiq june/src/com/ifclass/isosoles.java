package com.ifclass;

public class isosoles {
	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		int c = 20;
		if ((a == b) && (b == c)) {
			System.out.println("triangle is equilateral");

		} else if ((a == b) || (a == c) || (c == a)) {
			System.out.println("triangle is isosceles.");
		} else {
			System.out.println("Scalene triangle.");
		}
	}

}
