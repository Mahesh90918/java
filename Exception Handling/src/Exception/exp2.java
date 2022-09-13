package Exception;

public class exp2 {
	public static void main(String[] args) {
		//outer try bock.
		try {
			//inner try bock.
			try {
				int[] arr = new int[4];
				arr[5] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("......inner try bock...... ");
				e.printStackTrace();
				System.out.println(e);
			}
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println(".......outer try bock.......");
			ex.printStackTrace();
			System.out.println(ex);
		}
	}

}