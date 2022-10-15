package forloop;

public class for10phy {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int space = i; space <= 5 - 1; space++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
