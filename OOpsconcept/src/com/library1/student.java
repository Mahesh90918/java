package com.library1;

public class student extends library1 {
	int id;
	String name, book;
	int holdingdays, due;
	static int fine = 5;// penality perday 5
	static String lib = librarian;
	static String libr = "library";

	public student(int id, String name, String book, int holdingdays) {
		this.id = id;
		this.name = name;
		this.book = book;
		this.holdingdays = holdingdays;
	
	}

	public void fineDetails() {
		System.out.println("....library details..");
		System.out.println("librarian       " + lib);
		System.out.println("library         " + libr);
		System.out.println("student name    " + name);
		System.out.println("student id      " + id);
		System.out.println("bookname        " + book);
		System.out.println("holding days    " + holdingdays);
		if (holdingdays > 15) {
			int days = holdingdays - 15;
			due = days * fine;
			System.out.println("penality     " + due);
		} else {
			System.out.println("penality    " + "nodue");
		}
		System.out.println("...........................");
	}
    public static void main(String[] args) {
		student s1=new student(01, "mahesh", "java",15);
		student s2=new student(02, "sriman", "methods", 20);
		student s3=new student(03, "shan", "oops", 13);
		student s4=new student(04,"kumar","constructor",17);
		student s5=new student(05,"ravi","arrays",15);
		s1.fineDetails();
		s2.fineDetails();
		s3.fineDetails();
		s4.fineDetails();
		s5.fineDetails();
	}
}
