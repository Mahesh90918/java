package com.abstractclass;

 class empolyee1 extends employee {
	String fathername;
	long salary;

	public empolyee1(int id, String name, String role, String fathername, long salary) {
		super(id, name, role);
		this.fathername = fathername;
		this.salary = salary;
	}

	// this is only calls on when the abstract method placed in parent abstract
	// class
	@Override
	//we use public key no problem
	 void display() {
		super.displaydata();
		System.out.println("fathername :" + fathername);
		System.out.println("salary  :" + salary);
		System.out.println("..Employee details");
	}

	@Override
	void displaydata() {
		super.displaydata();
		System.out.println("fathername :" + fathername);
		System.out.println("salary  :" + salary);
		System.out.println("..Employee details");
	}

	@Override
	void display1() {
		// TODO Auto-generated method stub
		System.out.println("..display1...display1..");
	}

}