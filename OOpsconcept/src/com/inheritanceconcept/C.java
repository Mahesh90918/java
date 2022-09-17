package com.inheritanceconcept;

public class C extends B {
	public void C() {
		System.out.println("child class C");
	}

	public void talk() {
		System.out.println("child talking to much");
		super.eat();
		super.A();
	}public void eat() {
		System.out.println("child eatting chiken");
	}

}
