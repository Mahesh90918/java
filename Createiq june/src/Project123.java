import java.util.Scanner;

public class Project123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enther the source");
		String A = sc.nextLine();

		String a = "sec";
		String b = "skl";
		String c = "hyd";
		{
			if (a == "sec") {
				System.out.println(a);
			} else if (b == "skl") {
				System.out.println(b);
			} else if (c == "hyd") {
				System.out.println(c);
			}
		}
		
		String d = "lkp";
		String e = "pal";
		String f = "pan";
		{
			if (d == "lkp") {
				System.out.println(d);
			} else if (e == "pal") {
				System.out.println(e);
			} else if (f == "pan") {
				System.out.println(f);
			}
		}
	}
}