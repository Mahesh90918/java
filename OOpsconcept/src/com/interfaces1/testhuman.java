package com.interfaces1;

public class testhuman {
	public static void main(String[] args) {
		person we = new person(1, "mahesh", 1241325);
		we.mahesh111();
		System.out.println(we.mahesh());

		empolyee2 e = new empolyee2(02, "siva", 87);
		System.out.println(e.toString());
		e.person();
		e.student();
	}

}
