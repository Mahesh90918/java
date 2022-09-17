package com.abstractclass3;

import java.util.Random;

public class cricket extends Athlet {
	double points;

	protected cricket(int id, String name, String nickname, long dateofbirth, double points, String team) {
		super(id, name, nickname, dateofbirth, team);
		this.points = points;
	}

//	public void getStrickrate() {
//		Random S = new Random();
//		if (S.nextDouble() * 100 > points) {
//			System.out.println(points);
//			System.out.println("points is below20 ");
//		} else {
//			System.out.println("strickrate :"+points);
//
//		}
//	}

	@Override
	public void playerage() {
		// TODO Auto-generated method stub
		System.out.println("player eligible for age is above 18");
	}

	@Override
	public void getbiodata() {
		playerage();
		super.getbiodata();
		System.out.println("strickrate   :"+points);
	}public void Strickrate() {
		System.out.println("strickrate   :"+points);
	}

}
