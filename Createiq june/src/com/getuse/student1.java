package com.getuse;

public class student1 {
	//public static void main(String[] args) {
 /*     student s1 = new student(44, "hff", 76.85);
		s1.printstudent();
		student s2 = new student(54, "hfjgf", 6576);
		s2.printstudent();
		student s3=new student(45,"gjfjf",767);
		s3.printstudent();
		student s4 = new student();
		s4.setId(55);
		System.out.println(s4.getID());
		
		System.out.println("..................");
		
		student s5=new student();
		s5.setId(67);
		s5.setName("guytu");
		s5.setFee(245);
		s5.printstudent();
*/
	public void getbyalldetails() {
		student s1 = new student(01, "siva", 100);
		student s2 = new student(02, "shan", 200);
		student s3=new student(03,"mahesh",300);
		student ss[]= {s1,s2,s3};
		for(student s:ss) {
	
		s.printstudent();
		}
		}
		public void getbyId(int id) {
		student s1 = new student(01, "siva", 100);
		student s2 = new student(02, "shan", 200);
		student s3=new student(03,"mahesh",300);
		student ss[]= {s1,s2,s3};
		for(student s:ss) {
		if(s.getID()==id) {
		s.printstudent();
		
		}
		}
		}
		
		public void getbyName(String name) {
			student s1 = new student(01, "siva", 100);
			student s2 = new student(02, "shan", 200);
			student s3=new student(03,"mahesh",300);
			student dd[]= {s1,s2,s3};
			for(student s:dd) {
				if(s.getName()==name) {//if condition is use to any one id calls
// if condition allows only one bye one value
					s.printstudent();
				}
				
			}
			
		}
		
		
		
		
		public static void main(String[] args) {
			student1 sd=new student1();
			sd.getbyId(1);
		   // sd.getbyId(2);
			
			
			
			student1 ds=new student1();
			ds.getbyName("mahesh");
			student1 all=new student1();
			all.getbyalldetails();
		}
		
		
		
	}
	
