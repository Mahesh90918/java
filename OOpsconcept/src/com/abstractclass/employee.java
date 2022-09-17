package com.abstractclass;

abstract class employee {
// In abstract class without abstract method no problem occurs that is also known as abstract class

	abstract void display();

	// IN the abstract class object creating
	// not possible because abstract does not allowing
	// because compiler error

//we can also create constructor and method and static keyword also
	int id;
	String name;
	String role;

	public employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	abstract void display1();

	void displaydata() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("role :" + role);

	}

}