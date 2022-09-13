package ExceptionInInitilizerError;

public class staticvariable {
// when this Error occurs in two conditions
	// 1.static variable initializers
	// 2.static block initializers

	static int s = 10 / 0;

	public static void main(String[] args) {
		System.out.println(staticvariable.s);
	}
}
// ExceptionInInitializerError occur
/*
 * Exception in thread "main" java.lang.ExceptionInInitializerError Caused by:
 * java.lang.ArithmeticException: / by zero at
 * ExceptionInInitilizerError.staticvariable.<clinit>(staticvariable.java:8)
 */