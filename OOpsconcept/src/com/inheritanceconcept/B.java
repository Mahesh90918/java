package com.inheritanceconcept;

public class B extends A {
	public void B() {
		System.out.println("child class B");
	}public void sleep() {
		System.out.println("child sleep");
		super.eat();
	}public void eat() {
		System.out.println("child B  eatting  briyani");
	}

}
