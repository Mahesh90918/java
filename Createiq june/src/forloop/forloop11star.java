package forloop;

public class forloop11star {
	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int space = 1; space <= (5 - i); space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}