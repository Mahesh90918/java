package com.getuse;

public class student {
	int id;
	String name;
	double fee;
	public student(int id,String name,double fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
		public student() {
		// TODO Auto-generated constructor stub
			System.out.println("default constructor");
	}
		public int setId(int id) {
			return this.id=id;
		}public String setName(String name) {
			return this.name=name;
			
		}public double setFee(double fee) {
			return this.fee=fee;
		}public int getID() {
			return this.id;
			
		}public String getName() {
			return name;
		}public double getFee() {
			return fee;
		}void printstudent(){
			System.out.println("id    :"+id);
			System.out.println("name  :"+name);
			System.out.println("fee   :"+fee);
			System.out.println("................");
		}
	}


