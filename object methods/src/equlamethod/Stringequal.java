package equlamethod;

public class Stringequal {
	public static void main(String[] args) {
		// in String class ALREADY " EQUALS METHOD OVERRIDDEN " if objects are different
		// but content is same then return TRUE
		String s1 = "mahesh";
		String s2 = "siva";
		String s3 = new String("mahesh");
		String s4 = new String("siva");
		String s5 = new String("mahesh");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));// true.." EQUALS METHOD OVERRIDDEN "
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));// true.." EQUALS METHOD OVERRIDDEN "
		System.out.println(s3.equals(s5));// true.." EQUALS METHOD OVERRIDDEN "
		System.out.println(s3.hashCode());
		System.out.println(s5.hashCode());
		
	}
}
