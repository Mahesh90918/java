
package com.getuse;

import java.util.Scanner;

public class Empolyee1 {
	
		
	
	public void getbyid(int id) {
		Empolyee id1=new Empolyee(01,"mahesh","developer",60000);
		Empolyee id2=new Empolyee(02,"shan","developer",600000);
		Empolyee id3=new Empolyee(03,"sriman","developer",60000);
		Empolyee id4=new Empolyee(04,"kumar","developer",60000);
		Empolyee sd[]= {id1,id2,id3,id4};
		for(Empolyee d:sd ) {
			
			if(d.getId()==id) //if condition is use to any one id calls
			{
			d.printempolyee();
			} 
				
			
		}	}
	public void getbyName(String name) {
		Empolyee id1=new Empolyee(01,"mahesh","developer",60000);
		Empolyee id2=new Empolyee(02,"shan","developer",600000);
		Empolyee id3=new Empolyee(03,"sriman","developer",60000);
		Empolyee id4=new Empolyee(04,"kumar","developer",60000);
		Empolyee sd[]= {id1,id2,id3,id4};
		
		int result=0;
		for(Empolyee d:sd ) {
		if (d.getName()==name) {
			d.printempolyee();
			result=1;
		} 		}if(result==0) {
			System.out.println("invalid details");
		}
	}
	public static void main(String[] args ) {
		Empolyee1 emp=new Empolyee1();
		emp. getbyid(2);
		//emp.getbyid(04);
		//emp.getbyid(06);
		Empolyee1 emp1 =new Empolyee1();
		emp1.getbyName("mahesh");
		//emp1.getbyName("kumar");
		emp1.getbyName("subbu");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id number");
		Empolyee1 abs=new Empolyee1();
		int id=sc.nextInt();
				abs.getbyid(id);
	}

}