package com.objectclass;

public class student1 {
	int id;
	String name;

	protected student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student1 [id=" + id + ", name=" + name + "]";
	}

//

	public static void main(String[] args) {
		student1 s = new student1(01, "mahi");
		// getClass shows all information about
		System.out.println(s.getClass());// object class

//	   Object obj=new Object();
//	   System.out.println(obj.getClass());
//	   System.out.println(obj);

	}
}
