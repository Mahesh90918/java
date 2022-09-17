package com.inheritanceconcept;

public class testABC2 {
	public static void main(String[] args) {
		B b = new B();
		b.sleep();
		b.eat();// updating data
		C c = new C();
		c.talk();
		c.eat();// updating data
		//b class inherited to the c class
		C d = new C();
          d.talk();
          d.eat();// updating the values presented
	}
}
