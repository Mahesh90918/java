package classcastexception;

public class testexample1 {
public static void main(String[] args) {
	example1 e= new example1(01, "mahesh");
	System.out.println(e);
	example21 e1= new example21(01, "mahesh", 2500);
	System.out.println(e1);
	
	// e=e1;// this mean both objects are equals
	 e.sound();
	 e1.sound();
	 
//		example1 e2 = new example1(01, "mahesh");
//		example21 e3 = (example21) e2;
//		System.out.println(e3);

	// class cast excption
	//child to parent
	example21 s=(example21)e;
	System.out.println(s);
}
}
