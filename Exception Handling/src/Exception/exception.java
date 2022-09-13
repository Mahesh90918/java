package Exception;

public class exception {
public static void main(String[] args) {
	int a=10;
	int  b=20;
	double c=b/a;
	try {
		System.out.println(c);
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println(e);
	}
}
}
