package com.youtube;

public class methodcallingarray {
	public static void main(String[] args) {

		int[] array= { 12, 34, 56, 78 };
		// method is calls object create
		methodcallingarray A=new methodcallingarray();
		A.display(array);
	}
	//method diplay parameter type
	void display(int[] array) {
// when array passing through parameter
		for (int z : array) {
			System.out.println(z);

		}

	}
}