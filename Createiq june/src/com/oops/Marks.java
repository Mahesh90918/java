package com.oops;
import java.util.Scanner;
public class Marks {
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id number");
		int a=sc.nextInt();
	 if(a==1) {
		
		 Marks results=new Marks();
		 results.telugu=99;
		 results.maths=99;
		 results.physics=98;
		 results.printmarks();
	 }if(a==2) {
		 Marks results1=new Marks();
		 results1.telugu=90;
		 results1.maths=90;
		 results1.physics=90;
		 results1.printmarks();
				
		
	}

}}
