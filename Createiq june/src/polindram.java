import java.util.Scanner;

public class polindram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int originalno = n;
		int reverse = 0;
		while (n != 0) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;

		}
		System.out.println(reverse);
		if (originalno == reverse) {
			System.out.println("this is polindram");
		} else {
			System.out.println("not polindram");
		}
	}
}
