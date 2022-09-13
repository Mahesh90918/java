package Exception;

public class exp1 {
public static void main(String[] args) {
	
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e);
		System.out.println("exception");
	}catch(Exception e) {
		System.out.println(e);
		
	}
	finally {
		System.out.println("mahesh");
	}
}
}
