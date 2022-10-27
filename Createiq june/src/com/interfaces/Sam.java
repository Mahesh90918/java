package com.interfaces;

import java.util.Arrays;

public class Sam {
//	public static void main(String[] args) {
//	     someMethod(null);
//	}
//	public static void someMethod(Object o) {
//	System.out.println("Object method Invoked");
//	}
//	public static void someMethod(String s) {
//	System.out.println("String method Invoked");
//	}
//}
 public static void main(String[] args) throws Exception {
	        char[] chars = new char[] {'\u0097'};
	        String str = new String(chars);
	        byte[] bytes = str.getBytes();
	        System.out.println(Arrays.toString(bytes));
	        System.out.println("\u0097"+"mahesh");

	}
}
