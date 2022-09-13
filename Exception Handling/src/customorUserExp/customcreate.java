package customorUserExp;

public class customcreate {
	// custom create or userdefined Exception
	// the exception which are raised by the programmer explicitly
	public static void main(String[] args) throws InSufficientfounds  {

		int amount = 10000;
		if (amount >1000) {
       throw new InSufficientfounds();
		} else {
			System.out.println("withdrawn successful");
		}
	}
}
// own create Exception
/*
Exception in thread "main" customorUserExp.InSufficientfounds
at customorUserExp.customcreate.main(customcreate.java:8)
*/