package com.methodtypes;

public class Methodclass {
	
		
	
	// 4 types of this methods----->you can reuse this method
//	1.with return and with parameters
	public int sum(int a, int b) {
	int total= a + b;
//	System.out.println(total);
		// 2.without return and without parameters
	return total;
	}

	public void display() {
		// void is a non-return type
		int a = 10;
		double b = 20;
		String c = "hello";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// return hello;
	}
		//3. with return and without parameter
	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	//4. without return and with parameter
	public void   student(int id,String name) {
	  id=11;
	  name="hhhij";
	  System.out.println("id"+id);
	  System.out.println("name"+name);
	  
	 
	}
}
