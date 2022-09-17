package com.inheritence;

public class Student extends human {
	// when we use extends human this is called child class
	
	@Override//annotation @over
	public void eat() {
		System.out.println("student can eat");
	}public void sleep() {
		System.out.println("student can sleep");
	}@Override
	public void talk() {
		System.out.println("student can talk");	
		}
}