package ExceptionInInitilizerError;

public class staticblockinitilizer {
	static{
		String s=null;
		System.out.println(s.length());
	}public static void main(String[] args) {
		
	}

}
// output
/*
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NullPointerException
	at ExceptionInInitilizerError.staticblockinitilizer.<clinit>(staticblockinitilizer.java:6)
*/




