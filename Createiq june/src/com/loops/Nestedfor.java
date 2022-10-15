package com.loops;

public class Nestedfor {
	public static void main(String[] args) {

		for (int i = 0; i <2; i++) {
			for (int j =i; j <=2; j++) {
				for(int k=j;k<=4;k++) {
				System.out.print("*" + " ");
			}
			System.out.println(".");
		}
System.out.println(",");
	}
}}