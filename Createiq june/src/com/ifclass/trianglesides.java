package com.ifclass;

public class trianglesides {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 8;
		if (a + b > c) {
			if (a + c > b) {
				if (b + c > a) {
					System.out.println("triangle");
				} else {
					System.out.println("not triangle");
				}
			} else {
				System.out.println("not triangle");
			}

		} else {
			System.out.println("not triangle");
		}
	}

}
