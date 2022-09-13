package customorUserExp;

public class testage {
	public static void main(String[] args) throws TooYoungException, TooOldException {
		int age = 20;

		if (age < 18) {
			throw new TooYoungException(" jgehjgfh");
		}
			else if (age > 60) {
			throw new TooOldException();
		}else {
			System.out.println("successfull to marry");
		}
	}
}

