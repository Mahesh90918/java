package com.basicprogrames;

public class Primenumber {
	public static void main(String[] args) {
		int num=280;
		int i=0;
		int co=num/2;
		int count =0;	
		if (num==0||num==1) {
			System.out.println("it is not prime number");
			
		}else {
			
			for(i=2;i<co;i++) {
				
				if (num%i==0) {
					
					System.out.println("It is not prime number");
					
					
					count=1;
					break;
					
				}
				
				}
			
			if(count==0) {
				
				System.out.println("it is prime number");
			}
				
				
			
			}
	}}
			
		
	


