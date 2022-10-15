package com.constructors;

public class Staticuse {
	String name;
	int roll;
	double fee;
// static String A = "INSTITUTE-NAME";
//	String constant;

	public Staticuse(String name, int sroll, double sfee) {
		this.name = name;
// don't use to name change then use( this.)
		roll = sroll;
		fee = sfee;
	//	this.constant=constant;
		System.out.println("..........");
	}

	public static void main(String[] args) {
		Staticuse s1 = new Staticuse("siva", 1, 323223);
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.fee);
//		System.out.println(s1.constant);

		Staticuse s2 = new Staticuse("lord", 2, 32);
		System.out.println(s2.name);
		System.out.println(s2.roll);
		System.out.println(s2.fee);
//		System.out.println(s2.constant);

	}


}
