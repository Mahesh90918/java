package com.getuse;

public class Empolyee {
	int id;
	String name;
	String role;
	double salary;
	static String COMPANY = "...........tcs........";

	public Empolyee(int id, String name, String role, double salary) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getId() {
		return id;

	}

	public void printempolyee() {
		System.out.println("id    :" + id);
		System.out.println("name  :" + name);
		System.out.println("role  :" + role);
		System.out.println("salary  :" + salary);
		System.out.println(COMPANY);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
