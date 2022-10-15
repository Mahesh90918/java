package com.ifclass;

public class divisibleby {
	public static void main(String[] args) {
		int num = 25;
		if (num % 5 == 0) {
			System.out.println(" num is divisible by 5");
		}
		if (num % 11 == 0) {
			System.out.println("num is divisible by 11");
		}if((num%5==0)&&(num%11==0))
		{
			System.out.println("num is divisible by 5 and 11");
		}else {
			System.out.println("its not devisible bye 5 and 11");
		}if((num%5==0)||(num%11==0)) {
			System.out.println("if num is divisible bye any one ");
		}else {
			System.out.println("if num is not divisible bye no one");
		}

	}
}