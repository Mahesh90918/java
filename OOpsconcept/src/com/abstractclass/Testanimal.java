package com.abstractclass;

class Testanimal {

	public static void main(String[] args) {
		Dog a = new Dog();//In a real scenario, object is provided through method, e.g., Animal() method 
		a.sound();
		
		cat d=new cat();
		d.sound();
		
		Dog f = new Dog();
		f.colour();
		f.sound();
		cat h=new cat();
		h.colour();
		h.sound();
		
		
		// Down casting
		// parent to child calling is "POSSIBLE"
		Animal b = new cat();
		Dog c = new Dog();
		b.sound();
		c.sound();
		
		
		//up casting
		//  child to parent calling is "IMPOSSIBLE"

//		cat e= new Animal();
//		Dog f=new Animal()
	}

}
