package com.constructors;

public class Parcon {
	int id;
	String name;
	double due;
	static String INSTITUE="ffhfghfg";
	public Parcon(int id,String name,double due) {
	this.id=id;
	this.name=name;
	this.due=due;
	}
	void printparcon() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("due "+due);
		System.out.println(INSTITUE);
		System.out.println("............");
	}public static void main(String[] args) {
		Parcon s1=new Parcon(1, "fytf", 98);
		s1.printparcon();
		
		Parcon s2= new Parcon(2,"fdd",34);
		s2.printparcon();
		
		
	
	}
	}



