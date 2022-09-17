package com.inheritanceconcept;

public class testinheritanceclsABC {
	public static void main(String[] args) {
		B h = new B();
		h.B();
		h.A();// we can calls also child reference to parent method calls
		// we cannot calls thought child reference to child object
		// h.C();//The method C() is undefined for the type B
		System.out.println("........child B.............");
		C j = new C();
		j.A();// we can calls parent class to child reference object
		j.C();
		// we cannot class
		// j.B();//The method B() is undefined for the type C
		System.out.println(".........child C............");

		//now calls parent reef to child
		A k=new A();
		k.A();//we can calls only parent reef to parent only
		
		//we cannot calls to parent reef to child's
		//k.B();
		//k.C();
		System.out.println("......parent class A.......");
		// now can calls parent reef to child object
		
		A l=new B();
		l.A();//can calls par reef to child object
		//l.B();//The method B() is undefined for the type A
		//l.C();//The method C() is undefined for the type A
		System.out.println("....parent ref to child object......");
	}

}
