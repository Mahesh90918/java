package com.library1;

public class shankarao extends library2 {

	void getid(int id) {
		Mahesh s1 = new Mahesh(01, "mahesh", 15);
		Mahesh s2 = new Mahesh(02, "sriman", 30);
		Mahesh s3 = new Mahesh(03, "shan", 13);
		Mahesh s4 = new Mahesh(04, "kumar", 40);
		Mahesh s5 = new Mahesh(05, "ravi", 33);
		System.out.println("...................");
		Mahesh mah[] = { s1, s2, s3, s4, s5 };
		int a=0;
		for (Mahesh s : mah) {
			if (s.getid() == id) {
				s.shankar();
				a=1;
			}
		}if(a==0) {
			System.out.println(".....wrong details...");
		}

	}

	void getname(String name) {
		Mahesh s1 = new Mahesh(01, "mahesh", 50);
		Mahesh s2 = new Mahesh(02, "sriman", 30);
		Mahesh s3 = new Mahesh(03, "shan", 13);
		Mahesh s4 = new Mahesh(04, "kumar", 30);
		Mahesh s5 = new Mahesh(05, "ravi", 40);
		
		System.out.println("...................");
		Mahesh mah[] = { s1, s2, s3, s4, s5 };
		int a=0;
		for (Mahesh s : mah) {
			if (s.getname() == name) {
				s.shankar();
				a=1;
			}
			}	
			if(a==0){
			System.out.println("...wrongdetails....");
		}
		}
	

	public static void main(String[] args) {
		shankarao shank = new shankarao();
		shank.getid(07);
		shank.getid(03);
		shank.getname("ravi");
		shank.getname("fdsfgsg");
	}

}
