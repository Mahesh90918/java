package com.interfaces1;

public abstract  class empolyee implements human {
	int id;
	String name;
	long salar;


protected empolyee(int id, String name, long salar) {
		super();
		this.id = id;
		this.name = name;
		this.salar = salar;
	
	}


@Override
public String toString() {
	empolyee1();
	return "empolyee [id=" + id + ", name=" + name + ", salar=" + salar + "]";
}@Override
public  void empolyee1() {
	System.out.println("empolyee");
}

}



