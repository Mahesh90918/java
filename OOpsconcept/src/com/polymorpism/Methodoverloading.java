package com.polymorpism;

public class Methodoverloading {
	       // method overloading
	
// compile time polymorpism----> method overloading-----> static binding
		
// runtime time---> method overriding -------> dynamic binding
	
// method name should be same but different parameters is calling method overloading 


	public byte sum(byte a,byte b) {
		return (byte)(a+b);
	}
	public short sum(short a,short b) {
		return (short) (a+b);
	}
	public int sum(int a,int b) {
		
	return(a+b);
}public long sum (long a,long b) {
	return a+b;
}public double sum(double a,double b) {
	return a+b;
}public float sum(float a,float b) {
	return a+b;
}public static void main(String[] args) {
	
	//this is called methodoverloading why because 
	//all method calls with sum() method only and differnt parameters
	
	Methodoverloading sum=new Methodoverloading();
		System.out.println(sum.sum(123, 3));//byte
		System.out.println(sum.sum(1500, 1500));
		System.out.println(sum.sum(13332, 333333));
		System.out.println(sum.sum(456556444, 5444756));
		System.out.println(sum.sum(3543.54f, 65465.6545f));//float
		System.out.println(sum.sum(545.5465444d, 5644.63354252d));//double
		System.out.println(sum.sum(53533, 66));


	
}
}
