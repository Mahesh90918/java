package com.inheritanceconcept;

public class person extends passport {
	
	String firstname, lastname, location;
	int age,id;

	public person(int passportid,int id, int age, String firstname, String lastname, String location) {
		super(passportid);
	//	this.passportid=passportid;
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.location = location;
	}

	public person(int id, int age, String firstname, String lastname, String location) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.location = location;
	}public void getBioData() {
		System.out.println("person id: " + id);
		System.out.println("person fullname : " + firstname + " " + lastname);
		System.out.println("person age: " + age);
		System.out.println("person location: " + location);
		//super class used calling parent passport data
	     super.passport();
	}
}
