package com.MethodCon;

public class Method2 {
	int id;
	String name;
	int fee;
	static String STATIC_USE = "static";

	// default constructor calling
	
	
	public void Method2() {
		System.out.println("default method");
	}

	//parameterized constructor calling
	public Method2(int id, String name, int fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public Method2(int id, String name) {// id and name calling
		this.id = id;
		this.name = name;
	}

	public Method2(String name, int fee) {// name and fee calling
		this.name = name;
		this.fee = fee;
	}

	public Method2(int id, int fee) {// id and fee calling
		this.id = id;
		this.fee = fee;
	}

	void printmethod21() {// method21 calling
		System.out.println("id   :" + id);
		System.out.println("name :" + name);
		System.out.println("fee   :" + fee);
		System.out.println("static use   :" + STATIC_USE);
	}

//	void printmethod22() {// method22 calling
//		System.out.println("id " + id);
//		System.out.println("name :" + name);
//	}

	public static void main(String[] args) {
		// default constructor
	//	Method2 s5=new Method2();
//		s5.id=30;
//		s5.name="sriman";
//		s5.fee=798798;
//		System.out.println(s5.id);
//		System.out.println(s5.name);
//		System.out.println(s5.fee);

		// parametrized constructor calling
		Method2 s1 = new Method2(1, "mahe", 212);// parametrized constructor calling
		Method2 s2 = new Method2(2, "shan", 887);// parametrized constructor calling
		Method2 s3 = new Method2(3, 8767868);// id and fee calling
		Method2 s4 = new Method2(4, "siva");// id and name calling output
		Method2 s6 = new Method2("jhgsdg", 5323);// name and fee calling
		s1.printmethod21();
		s2.printmethod21();
		System.out.println(s3.id);
		System.out.println(s3.fee);
		System.out.println(Method2.STATIC_USE);
		// s4.printmethod22();
		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println("static use..:"+s4.STATIC_USE);
		//System.out.println(Method2.STATIC_USE);
		// s6.printmethod22();
		System.out.println(s6.name);
		System.out.println(s6.fee);
		
		System.out.println("static use..:"+s6.STATIC_USE);
		//System.out.println(Method2.STATIC_USE);
		s3.printmethod21();

	}
}
