package com.math;

public class powers {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		double c = 3.37;// up value
		double d = 3.99;// down value
		double e = 56.48;
		System.out.println(Math.pow(a, b));// a power b
		System.out.println(Math.sqrt(a)); // square root a
		System.out.println(Math.ceil(c));// near value identification up number
		System.out.println(Math.floor(d));// near down value
		System.out.println(Math.rint(e));// 0.5 above or below identification as per mats rules
		System.out.println(Math.max(a, b));// maximum number
		System.out.println(Math.min(a, b));// minimum number
		System.out.println(Math.cbrt(5));
		System.out.println(Math.abs(-12));// mod value || like
		System.out.println(Math.random());// it changes it self o<x<1 condition below point values
	}

}
