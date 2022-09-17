package com.abstractclasscricket;

public class players extends cricket {
int age;
String team;
	protected players(int id, String name, String nickname,int age, int century, int halfcentury,String team, double Strikerate) {
		super(id, name, nickname, century, halfcentury, Strikerate);
		this.age=age;
		this.team=team;
			
		
	}

	public void getbiodata() {
		System.out.println( super.toString());
		 System.out.println("  age :"+age);
		System.out.println("  team :"+team);
		System.out.println("..............................");
	
	}
}
