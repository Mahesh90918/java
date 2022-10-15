package com.inheritence;

public class Inheritence {
	public static void main(String[] args) {
		// varaswatham
		
	//calling human class
	human Human=new human();
	Human.eat();
	Human.sleep();
	Human.talk();
	
	//calling from person class
	person person=new person();
	person.eat();
	person.sleep();
	person.talk();
	// calling from Student class
	Student student=new Student();
	student.eat();
	student.sleep();
	student.talk();
	
	}
	}
