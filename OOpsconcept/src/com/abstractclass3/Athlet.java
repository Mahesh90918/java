package com.abstractclass3;

public abstract class Athlet {
	int id;
	String name,nickname;
	long dateofbirth;
	String team;
	protected Athlet(int id, String name, String nickname, long dateofbirth, String team) {
		
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.dateofbirth = dateofbirth;
		this.team = team;
	}
	
  public void getbiodata() {
	  System.out.println("id           :  "+id);
	  System.out.println("name         : "+name+"("+(nickname)+")");
	  System.out.println("nickname     : "+nickname);
	  System.out.println("dateofbirth  : "+dateofbirth);
	  System.out.println("team         : "+team);
	  System.out.println("........................");
  }
  public abstract void playerage();
}
