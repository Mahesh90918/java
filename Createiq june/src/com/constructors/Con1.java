package com.constructors;

public class Con1 {
	String name;
	int roll;
	double fee;
// String A = "INSTITUTE-NAME";
	String constant;

	public Con1(String name, int sroll, double sfee, String constant) {
		this.name = name;
// don't use to name change then use( this.)
		roll = sroll;
		fee = sfee;
		this.constant=constant;
		System.out.println("..........");
	}

	public static void main(String[] args) {
		Con1 s1 = new Con1("siva", 1, 323223,"INSTITUTE-NAME");
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.fee);
		System.out.println(s1.constant);

		Con1 s2 = new Con1("lord", 2, 32,"INSTITUTE-NAME");
		System.out.println(s2.name);
		System.out.println(s2.roll);
		System.out.println(s2.fee);
		System.out.println(s2.constant);

	}

}
