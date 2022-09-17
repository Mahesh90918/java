package com.interfaces2multilevel;

public class method2 implements method,method1 {
//multiple inheritance
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("eatting  ...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("sleeping....");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk.....");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("talk......");
	}

}
