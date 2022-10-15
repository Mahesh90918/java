package com.ifclass;

public class percentage {
	public static void main(String[] args) {
		int physics=50;
		int chemistry=90;
		int maths=40;
		int telugu=40;
		int english=60;
       int result=physics + chemistry + telugu + maths + english;
		double percentage = (physics + chemistry + telugu + maths + english) / 5.0;
		if (percentage >= 90) {
			System.out.println("grade  A  :"+result);
		}
		if ((percentage >= 70) && (percentage < 89)) {
			System.out.println(" grade  B  :"+result);
		}
		if ((percentage >= 60) && (percentage < 69)) {
			System.out.println("grade  C  :"+result);
		}
		if ((percentage >= 50) && (percentage <= 59)) {
			System.out.println("grade  D  :"+result);
		}
		if (percentage <= 40) {
			System.out.println("fail  "+result);
		}

	}
}