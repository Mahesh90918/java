package com.interfaces;

public interface example {
	String s = "mahesh";
	static String s1 = "mahesh";
	final String s4 = "mahesh";
	final static String s2 = "mahesh";
	static final String s3 = "mahesh";

	void add();

	void add1();

	static void add2() {
		System.out.println("since jav 8");
	}

	default void add3() {
		System.out.println("since jav 8");
	}

	private void add4() {
		System.out.println("since jav 9");
	}
}
