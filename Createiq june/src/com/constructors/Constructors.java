package com.constructors;
public class Constructors {// constructer calls only class 
	int id;
	String name;
	double fee;
	
	public Constructors(int iid, String namee, double feee) {
	// above condition is parameterized constructor
		id = iid;
		name = namee;
		fee = feee;
		System.out.println("............");
	}
	 public static void main(String[] args) {
	Constructors s1=new Constructors(1,"mahi",76);
		
//	s1.id=1;
//	s1.name="mahi"; //only calls on constructors
//	s1.fee=654;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.fee);
		
		Constructors s2=new Constructors(2,"shankar",76);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.fee);

		Constructors s3=new Constructors(3,"siva",8776);
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.fee);
		 
	}

}
