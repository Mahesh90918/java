package com.interfaceimple;

public interface example {

	abstract void m1();
	static String s="mahesh";
	
	private void m2() {
		System.out.println("m2 private");
	}
	default void m3() {
		System.out.println(" method m3 default ");
	}
	static void m4() {
		System.out.println("method m4 static ");
	}
	public static void m5() {
		System.out.println("method m5  public default ");
	}
	public static void m6() {
		System.out.println("method m6 public static ");
	}
}
