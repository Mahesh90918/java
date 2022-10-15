package variablesinjava;

public class vari {
// with in class level create instance and class variables

// instance variables(non static variables)
	int id = 10;
	String name = "mahesh";
//class variables(static variables)
	static int id1 = 10;
	static String name1 = "siva";

	public static void main(String[] args) {
		// create local variables with in the method
		// local variables
		int a = 10;
		String name2 = "shankar";
		System.out.println(a);
		System.out.println(name2);

		// instance variables calls like that
		System.out.println(new vari().id);
		System.out.println(new vari().name);
		// static variables calls like that
		// calls directly no problem
		System.out.println(id1);
		System.out.println(name1);
	}
}
