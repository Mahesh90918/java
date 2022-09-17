package com.oops;

public class Selectmarks {
	int telugu;
	int maths;
	int physics;
	int total;
	 public void printmarks() {
		 int total=(telugu+maths+physics);
		 System.out.println("telugu "+telugu);
		 System.out.println("maths "+maths);
		 System.out.println("physics"+physics);
		 System.out.println("total "+total);
		 System.out.println(",,,,,,,,,,,,,,,,");
		 
	 }
	 public static void main(String[] args) 
	 {
		
		 Selectmarks results=new Selectmarks();
		 results.telugu=99;
		 results.maths=99;
		 results.physics=98;
		 results.printmarks();
				
		
	
	 Selectmarks result1=new Selectmarks();
	 result1.telugu =98;
	 result1.maths=97;
	 result1.physics=90;
	 result1.printmarks();
	 
	 }
}


