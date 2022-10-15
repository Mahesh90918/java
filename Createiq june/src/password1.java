import java.util.Scanner;

public class password1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		String password = "123456";
	//	char[] password1=password.toCharArray();
		for (int i = 1; i <= count; i++) {

			System.out.println("Enter the password");
			String ps = sc.nextLine();
			if (ps.length() == 6) {
			 if (password.equals(ps)) {//.equals
					System.out.println(password);
					System.out.println("PASSWORD IS TRUE");
					break;
				} else {
					System.out.println("ENTER AGAIN PASSWORD");
				}
			}
			else  {
				System.out.println("LENGTH SHOULD BE 6 CHARCTERS");

			}

			if (i == 3) {
				System.out.println("!!!!!!WRONG ENTER 3 TIMES PLEASE WAIT!!!!!!!!");
			}
		}
	}

}
