package com.oops;

public class NumberExtract {
	public static void main(String[] args)
	{
	int num=436565;
	int rem;
	while(num>0)
	{
		rem=num%10;
		System.out.println(rem);
		num=num/10;
		
	}

}
}
