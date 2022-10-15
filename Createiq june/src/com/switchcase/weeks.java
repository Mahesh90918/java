package com.switchcase;

public class weeks {
	public static void main(String[] args) {
		int week = 19;
		char vowel = 'p';
		switch (week) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tues");
			break;
		case 3:
			System.out.println("wednessday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		default:
			System.out.println("invalid");
		}
		switch (vowel) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowels");
			break;
		case 'i':
			System.out.println("vowels");
			break;
		case 'o':
			System.out.println("vowels");
			break;
		case 'u':
			System.out.println("vowels");
			break;

		default:
			System.out.println("consonant");

		}

	}

}
