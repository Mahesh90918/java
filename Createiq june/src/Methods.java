
public class Methods {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		int c = 10;
		int d = 20;
		System.out.println(c - d);
		int e = 10;
		int f = 20;
		System.out.println(e * f);
		
		// method calling process
		adding (2,3);
		multi (3,4);
		divison (8,2);
		adding1 (4,2);
	}

	public static void adding(int a, int b) {
		System.out.println(a + b);
	}

public static void multi(int c,int d) {
	System.out.println(c*d);
}
public static void divison(double a,double b) {
	System.out.println(a/b);
	
}
public static void adding1(int a,int b) {
	System.out.println(a-b);
	
}
}
