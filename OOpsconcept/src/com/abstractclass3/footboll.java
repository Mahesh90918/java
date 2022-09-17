package com.abstractclass3;

public class footboll extends Athlet {
  int age;
	protected footboll(int id, String name,int age, String nickname, long dateofbirth, String team) {
		super(id, name, nickname, dateofbirth, team);
		this.age=age;
	}public void getage() {
		if(age>18) {
			System.out.println("you are eligible");
		}else {
			System.out.println("you are  not eligible");
		}
	}

	@Override
	public void playerage() {
		System.out.println("...age above 18 ...");
		
	}@Override
		public void getbiodata() {
			playerage();
			super.getbiodata();
		        getage();
		}public void footboll() {
			// TODO Auto-generated constructor stub
		}

}
