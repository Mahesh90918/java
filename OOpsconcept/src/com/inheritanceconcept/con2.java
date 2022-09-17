package com.inheritanceconcept;

public class con2 extends con1 {
	long fee;

	public con2(int id, String name, long fee) {
		super(id, name);// reuse parent class
		// super is used to call parent data from parent class
		this.fee = fee;
	}public con2(int id, String name) {
		//super(id,name);
		this.name=name;
		this.id=id;
	}public con2(String name,long fee){
	
		this.name=name;
		this.fee=fee;
	}

	public int getId() {
		return id;
	
	}public String getname() {
		return name;
	}public long getfee() {
		return fee;
	}

	 public void display() {
		 System.out.println("id :"+id+"name :"+name);
		System.out.println("id :" + id +" " +"name :" + name +" "+ "fee :" + fee);
		System.out.println("id :" + id +" \n" +"name :" + name +" \n"+ "fee :" + fee);

	}

}
