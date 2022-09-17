package com.oops;

public class Numbers {
	int first;
	int second;
	int third;
	 public void printnumber()
	 {
		 System.out.println("first "+first);
		 System.out.println("second "+second);
		 System.out.println("third "+third);		
		 System.out.println("..........");
	 }
	 public static void main(String[] args) {
		Numbers number=new Numbers();
		number.first=67;
		number.second=76;
		number.third=8776;
	 number.printnumber();
		
		
	}
}
