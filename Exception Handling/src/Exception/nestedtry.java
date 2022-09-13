package Exception;

public class nestedtry {
	public static void main(String[] args) {
		try {
			int c=10/0;
			System.out.println(c);
			System.out.println("outer try block");
			try {
			
				System.out.println("inner tryblock");
				try {
					
					System.out.println("sub inner try block");
				
				} catch (Exception e) {
					System.out.println("sub inner catch block");
				}
			} catch (ArithmeticException e) {
				System.out.println("inner catch block");
			}
		} catch (Exception e) {
			System.out.println("outer catch block");
		} finally {
			System.out.println("finally block");
		}
	}
}
