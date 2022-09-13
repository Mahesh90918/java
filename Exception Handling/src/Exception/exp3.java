package Exception;

public class exp3 {
	public static void main(String[] args) {
		// Outer try
		try {
			// inner 1 try
			try {
				// inner 2 try
				try {
					int a = 10;
					int b = 0;
					int c = a / b;

					System.out.println(c);

				} catch (NullPointerException e) {
					System.out.println(".....inner 2 try........");
				}
			} catch (ArithmeticException e) {
				System.out.println(".....inner 1 try........");
			}
		} catch (Exception e) {
			System.out.println(".....outer(main) try........");
		}
	}
}
