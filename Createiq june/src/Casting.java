

public class Casting {
	public static void main(String[] args) {
//		converting one  type to another type

		byte b = 127;// ---> 127
		int i = b;
		// implicit casting
		System.out.println(i);
		double d = i;
		System.out.println(d);

		// explicit casting
		int number = 123456;
		byte convertNumber = (byte) number;
		System.out.println(convertNumber);

		double amount = 3000.1245;
		int amountConverter = (int) amount;
		System.out.println(amountConverter);
	}

}
