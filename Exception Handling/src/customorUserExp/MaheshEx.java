package customorUserExp;

public class MaheshEx extends RuntimeException {
	public MaheshEx(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}public MaheshEx() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int age = 10;
		if (age < 18) {
			throw new MaheshEx("Exception creation");
		} else {
			System.out.println("eligiable");
		}
	}
}
