package com.scanner;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		
		int balance=100000,withdraw,deposite;
		Scanner sc =new Scanner(System.in);
		
		while(balance>1) {
		//while condition is used repeating the condition	
			System.out.println("ATM machine");
			System.out.println("....banking.....");
			System.out.println("choose 1 for withdrwal");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for checking");
			System.out.println("choose 4 for exist");
			
			int m=sc.nextInt();
			switch(m) {
			case 1:
				System.out.println("enter many to withdraw");
				withdraw=sc.nextInt();
				if(balance>withdraw) {
					balance=balance-withdraw;
					System.out.println("collect money");
				}else {
					System.out.println("insufficient balance");
				}break;
			case 2:	
				System.out.println("enter money deposit");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("sucessfully deposit");
				break;
			case 3:
				System.out.println("balance :"+balance);
				
				break;
			case 4:
				System.out.println("today good day for you");
				System.out.println("....exist.....");
			 balance=0;
			 break;
			}
		}
			
		}
	}


