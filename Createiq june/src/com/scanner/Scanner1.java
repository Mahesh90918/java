package com.scanner;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the roll numbers");
		int rollno=sc.nextInt();
		System.out.println("enter fee");
		double fee=sc.nextDouble();
		System.out.println("name " +name +"rollno "+rollno+ "fee "+fee);
		
	}

}
