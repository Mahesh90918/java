package com.constructors;

public class Con2 {
	int id;
	String name;
	double fee;
	public Con2( int id ,String name,double fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
		
	}
	void printcon2() {
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("fee"+fee);
		System.out.println("..............");
	}
	public static void main(String[] args) {
		
	
        Con2 a=new Con2(4,"tfg ",235);
         a.printcon2();
	}
}
