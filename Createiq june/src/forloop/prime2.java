package forloop;

public class prime2 {
	public static void main(String[] args) {
		int x = 97;
		int count = 0;
		// number>1 
		if (x > 1) {
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}
			}

			// factors only 1 and its self
			if (count == 2) {
				System.out.println(" prime number");
			} else {
				System.out.println("it's not prime number");
			}
		}else {
			System.out.println("it's not prime number");
		}
	}

}
