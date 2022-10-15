 package com.methodtypes;

public class methodtype1 {
public int add(int a,int b) {
	return (a+b);
}
public static void main(String[] args) {
	methodtype1 ee=new methodtype1();
	System.out.println(ee.add(10, 54));
	//any type data calls no problem
	float total=ee.add(12, 12);
	System.out.println("another type object calls " +total);
}
}
