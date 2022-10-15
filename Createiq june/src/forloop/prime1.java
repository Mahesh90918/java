package forloop;

public class prime1 {
	public static void main(String[] args) {

		// int count ;
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
				//System.out.println(j);
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}
}