package com.library1;

public class Mahesh extends library2 {
	int id,due;
	String name;
	int holdingdays;
	static int penality=5;
	static String librarian="mahesh";
	static String library="createiq";
	
	public Mahesh(int id,String name,int holdingdays) {
		this.id=id;
		this.holdingdays=holdingdays;
		this.name=name;
		
	}public  void shankar() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(holdingdays);
		System.out.println(librarian);
		System.out.println(library);
		if (holdingdays>30) {
		int	days=holdingdays-30;
			due=days*penality;
			System.out.println("penality     :"+days);	
		}else {
			System.out.println(".....Noo penality.....");
		}
	}
//no use this type only use private keyword
	/*
	 * public String setName(String name2) { // TODO Auto-generated method stub
	 * return name2=name;
	 */
	
	int getid(){
		return this.id;
	}String getname(){
		return this.name;
	}
	
		

}
