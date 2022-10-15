package com.constructors;

public class narrowing {
	public static void main(String[] args) {

//		float f = 10.55f;
//		//int a=f;//Compile time error  
//       int a = (int) f;
//		System.out.println(f);
//		System.out.println(a);
		
		
//		int a=2;
//		//overflow
//		float b=(int) a;
//		System.out.println(a);
//		System.out.println(b);
		
//		byte a=10;  
//		byte b=10;  
//		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
//		int c=(byte)(a+b);  
//		System.out.println(c); 
//		
		
//		byte a=10;  
//		byte b=10;  
//		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
//		float c=(byte)(a+b);  
//		System.out.println(c);
		
		double a=10.50;  
		double b=10.6;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		long c=(long) (a+b);  
		System.out.println(c); 
	}
}
