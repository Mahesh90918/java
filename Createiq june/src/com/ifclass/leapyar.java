package com.ifclass;

public class leapyar {
	public static void main(String[] args) {
		int num = 2028;
		if ((num % 4 == 0) && (num != 100)) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}if(num%400==0) {
			System.out.println("not leapyear");
		}

	}
}
