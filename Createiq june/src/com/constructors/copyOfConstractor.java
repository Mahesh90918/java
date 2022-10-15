package com.constructors;

public class copyOfConstractor {
	int id;
	String name;

	public copyOfConstractor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public copyOfConstractor(copyOfConstractor c) {// constructor expected copyOfConstractor object
		this.id = c.id;
		this.name = c.name;
	}

	@Override
	public String toString() {
		return "copyOfConstractor [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		copyOfConstractor v= new copyOfConstractor(01, "mahesh");
		copyOfConstractor v1= new copyOfConstractor(v);// constructor taking copyOfConstractor object
		System.out.println(v);
		System.out.println(v1);
		
	}
}
