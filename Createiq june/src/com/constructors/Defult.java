package com.constructors;

public class Defult {
	int id;
	String name;
	double fee;

	public Defult() {
		System.out.println("id" + id);
		System.out.println("name" + name);
		System.out.println("fee" + fee);
		System.out.println("................");
//defult constructor program
// above condition is parameterized constructor
	}

	public static void main(String[] args)
	{
		Defult student = new Defult();
		student.id = 1;
		student.name = "mahesh";
		student.fee = 2500.00;
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.fee);

		Defult s2 = new Defult();
		s2.id = 2;
		s2.name = "ravi";
		s2.fee = 88787;
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.fee);

		Defult s3 = new Defult();
		s3.id = 3;
		s3.name = "siva";
		s3.fee = 423;
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.fee);

	}

}
