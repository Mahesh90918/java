package com.ifclass;

public class alphabet {
	public static void main(String[] args) {
		char ch='9';
		
		if((ch>='a')&&(ch<='z')) {
			System.out.println("the character is between a -z");
		}if((ch>='A')&&(ch<='Z')) {
			System.out.println("the character is between A -Z");
		} 
		if((ch>='0')&&(ch<='9')) {
			System.out.println("its a number");
		}else {
			System.out.println("not character");
		}
		
		
	}
}

