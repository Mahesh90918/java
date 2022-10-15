package com.block;

import java.util.Scanner;

public class instance {
//	{
//		System.out.println(".....APSRTC travell.....");
//	{
	static {
		System.out.println(".....APSRTC travell.....");
	}

	int id;
	String name;
	String start;
	String dest;

	public instance(int id, String name, String start, String destination) {
		this.id = id;
		this.name = name;
		this.start = start;
		dest = destination;

	}

	void printinstance() {
		System.out.println("id      :" + id);
		System.out.println("name    :" + name);
		System.out.println("start   :" + start);
		System.out.println("dest    :" + dest);

		System.out.println(".....destination comple.....");
	}

	public static void main(String[] args) {
		 

		instance object = new instance(1, "mahi", "sklm", "sec");// parametarized constructor
		object.printinstance();

		instance object1 = new instance(2, "raj", "sec", "hyd");
		object1.printinstance();
	}

}
