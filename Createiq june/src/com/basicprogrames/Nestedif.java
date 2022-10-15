package com.basicprogrames;

public class Nestedif {
	public static void main (String[] args)
	{
		int a=100;
		int b=24;
		int c=9;
		if(a>b) 
		{
		if(a>c) 
		{
			System.out.print("a is big");
			}
		}
		
		
		if(b>a)
		{
		if(b>c) 
		{
			
			System.out.print("b is big");
		}
		}
		if(c>a)	
		{
			if(c>b)
			{
				System.out.print("c is big");
				}
		}
			}
		}
	


