package customorUserExp;
//RuntimeException is uncheckedException
public class MaheshException extends RuntimeException {
	public MaheshException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}public MaheshException() {
		// TODO Auto-generated constructor stub
	}
//}
//
//class test {

	public static void main(String[] args)  {
		int age = 10;
		if (age < 18) {
			throw new MaheshException("Exception occur");
		} else {
			System.out.println("eligiable");
		}
	}
}