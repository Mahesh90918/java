package classcastexception;

public class classcast {
	public static void main(String[] args) {
		// normal child to parent
		String s = "mahesh";
		Object obj = s;
		System.out.println(s);
		// parent to child class casting error
		Object obj1 = new Object();
		String s1 = (String) obj1;
		System.out.println(s1);
	}
}
