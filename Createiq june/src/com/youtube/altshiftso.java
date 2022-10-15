package com.youtube;

public class altshiftso {

	int a;
	double b;
	String subject;
	String name;
	
	
	//parameter constructor is created shortcut (alt+shift+s+o)
	protected altshiftso(int a, double b, String subject, String name) {
		super();
		this.a = a;
		this.b = b;
		this.subject = subject;
		this.name = name;
	}
	
	//alt+shift+s+s print the data "toString() method " use
	@Override
	public String toString() {
		return "altshiftso [a=" + a + ", b=" + b + ", subject=" + subject + ", name=" + name + "]";
	}



	//constructor shortcut (ctrl+space)
	public void altshiftso() {
		System.out.println((a)+" "+(b)+subject+name);
	}public static void main(String[] args) {
		
	
	altshiftso f=new altshiftso(1, 32.0, "maths", "mahesh");
	f.altshiftso();
	System.out.println(f.toString());
}}
