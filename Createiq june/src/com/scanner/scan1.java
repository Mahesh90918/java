package com.scanner;

import java.util.Scanner;

public class scan1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		int c= a + b;
		int d= a-b;
	System.out.println( "substraction of two values  "+d);
		System.out.println("Addition two values: " + c);
	}
}