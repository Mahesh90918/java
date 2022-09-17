package com.abstractclass3;



public class Testathlet {
	public static void main(String[] args) {
	
		Athlet cric1=new cricket(01	, "rohit", "sharma", 1980, 150.77, "india");
		Athlet cric2 = new cricket(02, "virat", "kohli", 1990, 160.99, "india");
		Athlet cric3 = new cricket(03, "pant", "rishad", 1995, 150.32, "india");
//	cric1.getbiodata();
//	cric2.getbiodata();
//	cric3.getbiodata();
//	
	
		Athlet footboll1=new footboll(01, "ronald", 40, "christon", 1990, "india");
		Athlet footboll2=new footboll(02, "mahesh", 40, "mahesh", 1999, "india");
		Athlet footboll3=new footboll(03, "siva", 10, "christon",2012, "india");
	
//	footboll1.getbiodata();
//	footboll2.getbiodata();
//	footboll3.getbiodata();
		//Testathlet te=new Testathlet();
	Athlet [] test= {cric1,cric2,cric3,footboll1,footboll2,footboll3};
	for( Athlet tee:test) {
		tee.getbiodata();
		tee.playerage();
	}
		
		
			
		
	
	}
}
