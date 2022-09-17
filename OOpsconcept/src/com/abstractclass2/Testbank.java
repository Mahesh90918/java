package com.abstractclass2;

public class Testbank {
public static void main(String[] args) {
	
	sbi SBI=new sbi();
	andhra ANDHRA=new andhra();
	indian INDIAN=new indian();
	SBI.interestrate();
	ANDHRA.interestrate();
	INDIAN.interestrate();
	//return type calling
	System.out.println("SBI interestrate1  :"+SBI.interestrate1()+"%");
	System.out.println(" ANDHRA interestrate1  :"+ANDHRA.interestrate1()+"%");
	System.out.println("INDIAN interestrate1  :"+INDIAN.interestrate1()+"%");
	
	
}
}
