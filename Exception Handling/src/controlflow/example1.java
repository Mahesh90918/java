package controlflow;

public class example1 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
//		int c=a/b;//(normal terminations)means that we do use try block
//		System.out.println(c);
		System.out.println("try");
	}catch(ArithmeticException e) {
		int c=10/0;//(ABNORMAL terminations)means that we don't use try block
		System.out.println(c);
		System.out.println(" Exception");
		
	}finally {
			int c = 10 / 0;// (ABNORMAL terminations)means that we don't use try block
		System.out.println(c);
		System.out.println("finally");
	}
}
}
