package com.MethodCon;

public class Student {
	private String name;
	private String course;
	private double fee;
	private static String INSTITUTE = ".....SISTEM....";

	public Student(String name, String course, double fee) {
		this.name = name;
		this.course = course;
		this.fee = fee;

	}
//
//	public void printstudent() {
//		System.out.println("name : " + name);
//		System.out.println("course:  " + course);
//		System.out.println("fee : " + fee);
//		System.out.println(INSTITUTE);
//
//	}

	public String setName(String name) {
		return this.name;
	}

	public String setCourse(String course) {
		return this.course;

	}

	public double setFee(double fee) {
		return this.fee;

	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public double getFee() {
		return fee;
	}

	public static void main(String[] args) {
		Student s1 = new Student("mahesh", "ece", 25000);
//	    s1.printstudent();
		System.out.println(s1.getName() + "\n"  + s1.getCourse() + " \n" + s1.getFee());
		System.out.println(INSTITUTE);
	}
}