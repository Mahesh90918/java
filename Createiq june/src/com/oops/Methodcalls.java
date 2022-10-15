package com.oops;

public class Methodcalls {
	 String name;
	int age;
	int fee;

	public Methodcalls(int age, String name ,int fee) {
		this.age=age;
		this.fee=fee;
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		int i=1;
//		int result= change(i);
//		System.out.println("i "+result);
		
		Methodcalls meth=new Methodcalls(2,"mahi",  33);
		System.out.println(meth.age);
		System.out.println(meth.name);
		System.out.println(meth.fee);
		
		
	}

//	private static int change(int i) {
//		// TODO Auto-generated method stub
//		i=i+1;
//		return i;
	}


