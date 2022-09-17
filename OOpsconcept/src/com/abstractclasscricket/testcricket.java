package com.abstractclasscricket;

import java.util.Scanner;
import java.util.*;
public class testcricket {
	public void getBioData(int id) {
		players cricket1 = new players(01, "rohit", "sharma", 50, 20, 50, "india", 150.75);
		players cricket2 = new players(02, "virat", "kohli", 30, 40, 100, "india", 200.98);
		players cricket3 = new players(03, "pant", "rishad", 25, 30, 50, "india", 220.98);
		// cricket3.getbiodata();
		// cricket1.getbiodata();
		// cricket2.getbiodata();

		players[] cricket = { cricket1, cricket2, cricket3 };
		int result = 0;
		for (players crick : cricket) {

			if (crick.getId() == id) {
				result = 1;
				crick.getbiodata();
			}
		}
		if (result == 0) {
			System.out.println("invalid details");

		}

	}

	public void getBioname(String name) {
		players cricket1 = new players(01, "rohit", "sharma", 50, 20, 50, "india", 150.75);
		players cricket2 = new players(02, "virat", "kohli", 30, 40, 100, "india", 200.98);
		players cricket3 = new players(03, "pant", "rishad", 25, 30, 50, "india", 220.98);
		players c[] = { cricket1, cricket2, cricket3 };
		int result1 = 0;
		for (players cricket : c) {
			if (cricket.getname() == name) {
				result1 = 1;
				cricket.getbiodata();
			}
		}
		if (result1 == 0) {
			System.out.println("in valid name");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         testcricket test = new testcricket();
		System.out.println("Enter Player Id ");
		int input = sc.nextInt();
		test.getBioData(input);
		/*
		 * sc.nextLine(); System.out.println("Enter  name"); String name=sc.nextLine();
		 *///test.getBioname(name);
		
	
	}

}
