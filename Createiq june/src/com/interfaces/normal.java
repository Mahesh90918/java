package com .interfaces;

public class normal extends example2 {

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		normal n= new normal();
		System.out.println(n.hashCode());
		n.add5();
		n.add3();
		add2();
		add6();
		try {
			normal n1=normal.class.newInstance();
			System.out.println(n1.hashCode());
			n1.add3();
		
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
