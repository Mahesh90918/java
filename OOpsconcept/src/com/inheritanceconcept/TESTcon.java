package com.inheritanceconcept;

public class TESTcon {
	public static void main(String[] args) {

		con2 d = new con2(12, "mahesh", 5127);
		d.display();
        con2 s=new con2(43, "shankar");
      System.out.println(s.getId());
     System.out.println(s.getname());
     con2 f=new con2("siva", 25000);
     System.out.println(f.getname()+"\n"+f.getfee());
        
	}

}