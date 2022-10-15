package com.ifclass;

public class vowels {
	public static void main(String[] args) {
		char ch='e';
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
			System.out.println("vowle");
		}if((ch>='a')||(ch<='z')) {
			System.out.println("consonant");
		}else {
			System.out.println("identifier");
		}
	}

}
