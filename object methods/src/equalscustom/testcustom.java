package equalscustom;

public class testcustom {
	public static void main(String[] args) {
		custom c = new custom(01, "mahi", "abcd");
		custom c1 = new custom(01, "mahi", "abcd");

		/*
		 * System.out.println(c.equals(c1)); // false we can't override equals on that
		 * // time object equals is internal working
		 */

		System.out.println(c.equals(c1));
		// true we can override equals on that
		// time our own equals is internal working

		// same as like that has code also
		
		// i am overriding the Hascode
		// all custom are in equal hascode
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());

	}
}
