package arrayImp;

public class DuplicateElements1Strings {
	public static void main(String[] args) {
		String s[] = { "mahesh", "sriman", "mahesh", "sriman", "siva", "shan", "shan" };
		int len = s.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (s[i].equals(s[j])) {// String type equals method must
					s[i] = s[len - 1];
					len--;
				}
			}
		}
		System.out.println("with out repetation");
		for (int k = 0; k < len; k++) {
			System.out.print(s[k] + " ");
		}
	}
}
