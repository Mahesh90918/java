package com.abstractclasscricket;

public abstract class cricket {
	int id;
		
	String name;
	String nickname;
	int Century,Halfcentury;
	double Strikerate;
	protected cricket(int id, String name, String nickname, int century, int halfcentury, double Strikerate) {
	
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		Century = century;
		Halfcentury = halfcentury;
		this.Strikerate = Strikerate;
	}
	@Override
	public String toString() {
		return( "  id=" + id+"\n "+ " name=" + name +"\n "+ " nickname=" + nickname +"\n "+ " Century=" + Century+"\n "
				+ " Halfcentury=" + Halfcentury + "\n "+" Strickerate=" + Strikerate );
	
	
	}public int getId() {
		return id;
	}public String getname() {
		return this.name;
	}

	
	//public abstract void  getStrikerate();

}
