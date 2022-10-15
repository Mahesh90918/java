import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		int password = 123456;
		for (int i = 1; i <= count; i++) {

			System.out.println("Enter the password");
			int ps = sc.nextInt();
			if (ps == password) {
				System.out.println(password);
				System.out.println("password is true");
				break;
		
		} else {
				System.out.println("enter Again password");
			}
			if (i == 3) {
				System.out.println("wrong enter 3 times please wait");
			}
		}
	}

}
