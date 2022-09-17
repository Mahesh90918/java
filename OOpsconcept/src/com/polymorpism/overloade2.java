package com.polymorpism;

//ambiguous problem programee

public class overloade2 {//different parameters
	public void add(int a,float b) {//ambiguous
		//(int,int) crt way like
		System.out.println(a+b);
	}public void add(float a,int b) {//ambiguous 
		//(float,float)
		System.out.println(a+b);
	}public static void main(String[] args) {
		overloade2 add=new overloade2();
		// interchanging the parameter in that time 
		//same values can't be given this is called ambiguous error
//		add.add(20, 2222);
	}

}
