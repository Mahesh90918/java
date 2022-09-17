package com.inheritanceconcept;

public class TESTclsAaBb {
	public static void main(String[] args) {
		//parent object calling
		Aa h=new Aa();
		h.add();
		//child object calling
		
		Bb j= new Bb();
		j.add();
		//if no values given to the sum but calls the parent values
		j.sum();
		//if values given to the class Bb
		
	}

}
