package com.string;

public class Stringliteral {
	public static void main(String[] args)
	{
		String A="welcome to java";
		String B="zome to home";
		System.out.println(A);
		System.out.println("length of given string "+A.length());
		System.out.println(A.substring(3,9));
		System.out.println(A.substring(5,14));
		System.out.println(A.codePointCount(9, 14));
		System.out.println(A.compareToIgnoreCase(B));
		System.out.println(A.compareTo(B));
		System.out.println(A.concat(B));
		System.out.print(A.endsWith(B));
		
	}

}
