package com.youtube;

import java.util.Random;

public class Rollingdies {
	public static void main(String[] args) {
		Random ravi=new Random();
		int a=ravi.nextInt(6)+1;
		Random mahesh=new Random();
		int b=mahesh.nextInt(6)+1;
		Random sriman=new Random();
		int c=sriman.nextInt(6)+1;
		Random shan=new Random();
		int d=shan.nextInt(6)+1;
		
		//number of times rotate number of values changes
		System.out.println("ravi rollingdies:"+a);
		System.out.println("mahesh rollingdies:"+b);
		System.out.println("sriman rollingdies:"+c);
		System.out.println("shan rollingdies:"+d);
	}

}
