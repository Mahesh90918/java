package com.impl;

public class Example {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 6, 6, 6 };
		int max = 0;
		int SecondMax = 0;
		for (int i : arr) {
			if (i > max) {
				SecondMax = max;
				max = i;
			} else if (i > SecondMax && i != max) {
				SecondMax = i;
			}
		}
		System.out.println(max);
		System.out.println(SecondMax);

	}
}
