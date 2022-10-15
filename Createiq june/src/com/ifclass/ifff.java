package com.ifclass;

import java.util.Scanner;

public class ifff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
	     int marks=sc.nextInt();
	     
		if(marks>=90) {
			System.out.println("a");
		}else if(marks>80) {
			System.out.println("b");
		}else if(marks>70) {
			System.out.println("c");
		}else if(marks>50) {
			System.out.println("e");
		}else if(marks>0) {
			System.out.println("fail");
		}

}}
