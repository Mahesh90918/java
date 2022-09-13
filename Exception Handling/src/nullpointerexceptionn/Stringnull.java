package nullpointerexceptionn;

public class Stringnull {
	public static void main(String[] args) {
		String s = "";
		String s1 = null;
		System.out.println(s.length());// 0
		// we can perform any operation on the null then we will get
		// NullpointerException
		System.out.println(s1.length());// nullpointerexception
		char[] arr=null;
		System.out.println(arr);
		//System.out.println(null);
	}
}
