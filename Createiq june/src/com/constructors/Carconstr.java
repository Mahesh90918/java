package com.constructors;

import java.util.Scanner;

public class Carconstr {
	int number;
	int seats;
	String colour;

	final static String COLOUR_NAME="blue";

	public Carconstr(int number, int seats, String colour) {

		this.number = number;
		this.seats = seats;
		this.colour = colour;
		System.out.println("........");

	}

	void printcarconstr() {
		System.out.println("number " + number);
		System.out.println("seats " + seats);
		System.out.println("colour " + colour);
		System.out.println("........");
	}
 


	@Override
	public String toString() {
		return "Carconstr [number=" + number + ", seats=" + seats + ", colour=" + colour + "]";
	}

	public static void main(String[] args) 
	{
		Carconstr c= new Carconstr(01, 10, "black");
		c.toString();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		
		if(a==1)
		{
		Carconstr s1 = new Carconstr(1, 98998, "black");
		s1.toString();
		s1.printcarconstr();
		}
		if(a==2)
		{
		Carconstr s2 = new Carconstr(2, 2332, "blue");
		s2.printcarconstr();
	}else  {
		//if (a>=3)
		System.out.println("wrong creditials");
	}}
}

