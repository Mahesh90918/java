package com.interfaces1;

 abstract class student implements human{
	 int a;
	 String name;
	 long fee;
public student(int a, String name, long fee) {
		super();
		this.a = a;
		this.name = name;
		this.fee = fee;
	}

 public  void studentss() {
	System.out.println("student");
}
public String mahesh() {
	
	return "student [a=" + a + ", name=" + name + ", fee=" + fee + "]";
              
}

}
