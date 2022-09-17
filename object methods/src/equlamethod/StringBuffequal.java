package equlamethod;

public class StringBuffequal {
	public static void main(String[] args) {
         // object equals method is working
		// reference compare  (Address compare)
		// in StringBuffer class " EQUALS METHOD "not" OVERRIDDEN " if objects are
		// different
		// but content is same then return "FALSE"
		StringBuffer s1 = new StringBuffer("mahesh");
		StringBuffer s2 = new StringBuffer("siva");
		StringBuffer s3 = new StringBuffer("mahesh");
		StringBuffer s4 = new StringBuffer("siva");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s3));// false.." EQUALS METHOD "NOT" OVERRIDDEN "
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));// false.." EQUALS METHOD "NOT" OVERRIDDEN "
	}

}