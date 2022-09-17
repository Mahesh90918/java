package com.polymorpism;

public class overloade3 {
	public double add(int a,int b) {
		return a*b;
	}public long add(long a,int b) {// ambiguous 
		return a+b;
	}public static void main(String[] args) {
		overloade3 add=new overloade3();
		System.out.println(add.add(12, 20));
		System.out.println(add.add(22, 768));
		System.out.println(add.add(43, 2));
		
	}

}
