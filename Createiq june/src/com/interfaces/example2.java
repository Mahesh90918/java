package com.interfaces;

public abstract class example2 {
	String s = "mahesh";
	static String s1 = "mahesh";
	final String s4 = "mahesh";
	final static String s2 = "mahesh";
	static final String s3 = "mahesh";

	abstract void add();

	static void add2() {
		System.out.println("static");
	}

	public void add3() {
		System.out.println("public");
	}

	private void add4() {
		System.out.println("private");
	}

	final void add5() {
		System.out.println("final");
	}

	final static void add6() {
		System.out.println("final static");
	}
}
