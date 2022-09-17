package com.interfaces;

public class D implements A {

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println(A.colourblue+" meow");
	}

	@Override
	public void rat() {
		// TODO Auto-generated method stub
		System.out.println(A.ANSIGREEN+"  kichi kichi");
		System.out.println(D.ANSICYAN+"mahesh");

	}

	@Override
	public void cow() {
		// TODO Auto-generated method stub
		System.out.println(A.ANSIMAGENTA+"   amba.....");
	}

	@Override
	public void Dog() {
		// TODO Auto-generated method stub
		System.out.println(D.ANSIYELLOW+"    bow bow");
	}

}
