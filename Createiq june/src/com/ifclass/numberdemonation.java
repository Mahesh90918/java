package com.ifclass;

public class numberdemonation {
	public static void main(String[] args) {
		int amount = 26666;
		int notes500;
		int notes100;
		int notes50;
		int notes10;
		int notes1;

		if (amount >=500 ) {
			notes500 = amount / 500;
			amount = amount - (notes500 * 500);
			System.out.println("notes 500 :" + notes500);
		}
		if (amount>= 100 ) {
			notes100 = amount / 100;
			amount -= (notes100 * 100);
			System.out.println("notes 100 :" + notes100);
		}
		if (amount>=50) {
			notes50 = amount / 50;
			amount -= (notes50 * 50);
			System.out.println("notes  50 :" + notes50);
		}
		if (amount>=10) {
			notes10 = amount / 10;
			amount -= (notes10 * 10);
			System.out.println("notes  10 :" + notes10);
		}
		if (amount >=1) {

			notes1 = amount / 1;
			amount -= (notes1 * 1);
			System.out.println("notes   1 :" + notes1);
		}

	}
}
