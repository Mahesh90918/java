package com.objectclass;

public class student {
	static int id;
	String name;
public student() {
	// TODO Auto-generated constructor stub
}
	protected student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		student s = new student(01, " mahi ");
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		student s1 = new student(01, " mahi ");
		System.out.println(s1.hashCode());
		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());
		// this is object class
		student s2 =new student(01,"mahesh");
		System.out.println(s2.getstudent());
		System.out.println(s2.getClass());
		
		student s3=getstudent();
		System.out.println(s3);
	}
	private static student getstudent() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
