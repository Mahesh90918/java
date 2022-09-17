package com.interfaces;

public class testA {
	public static void main(String[] args) {
		// abstract class cannot create object
	//	B b = new c();
	//	b.rat();
	// q=new A();
	//	interface class cannot create object
		
		c a = new c();
		a.cat();
		a.cow();
		a.Dog();
		a.rat();

		D d = new D();
		d.cat();
		d.cow();
		d.rat();
		d.Dog();

	}
}