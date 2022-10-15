package com.ifclass;

import java.util.Arrays;

public class minandmaxfind {
	public static void main(String[] args) {

		int a = 1;
		int b = 8;
		int c = 3;
		if (a > b) {
			if (a > c) {
				System.out.println("a is big");
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println(" b is big");
			}
		}
		if (c > a) {
			if (c > b) {
				System.out.println("c is big");
			}
		}
		int[] arrays = { 1, 2,1, 3, 6, 5, 4, 8, 9, 7 };
		// steams API
		System.out.println("min number  :" + Arrays.stream(arrays).min());
		System.out.println("max number  :" + Arrays.stream(arrays).max());
		System.out.println("sum number  :" + Arrays.stream(arrays).sum());
		System.out.println(" number of length  :" + Arrays.stream(arrays).count());
		System.out.println(" Avarage  :" + Arrays.stream(arrays).average());
		System.out.println(" findfirst  :" + Arrays.stream(arrays).findFirst());
		System.out.println(" Avarage  :" + Arrays.toString(arrays));
	}

}
