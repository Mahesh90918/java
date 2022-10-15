package com.oops;

public class Personaldata {
 String name;
 String height;
 String weight;
 String study;
 public void printpersonaldata() 
 {
	 System.out.println("name "+name);
	 System.out.println("height "+height);
	 System.out.println("weight"+weight);
	 System.out.println("study "+study);
	 System.out.println("...............");
 }
 public static void main(String[] args)
 {
	 Personaldata person=new Personaldata();
	 
	 person.height="5ft";
	 person.weight="50kg";
	 person.name="mahesh";
	 person.study="btech";
	 person.printpersonaldata();
	 
	 
	
}
}
