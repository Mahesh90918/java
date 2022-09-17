package com.inheritanceconcept;

public class testposport {
	public static void main(String[] args) {
		person a=new person(10, 12, "unukuru", "mahesh", "sklm");
		person b=new person(02, 20, 34, "gokul", "krishna", "mum");
		//passport id=0 thats also wrong details
		person c=new person(00,21,44,"hgff","dsgfg","kalk");
	//	a.passport();
		a.getBioData();
	//	b.passport();
		b.getBioData();
		c.getBioData();
	}

}
