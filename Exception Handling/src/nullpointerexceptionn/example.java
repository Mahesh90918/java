package nullpointerexceptionn;

public class example {
	String s1 = null;
	static String s2 = null;

	public static void sound() {
		System.out.println("static method");
	}

	public void blow() {
		System.out.println("non Static method");
	}

	public static void main(String[] args) {
		example n = null;
		// only static
		// static methods calls from the variables initialized as null
		n.sound();
		// System.out.println(n.s1);// nullpointerexception NON STATIC method
		System.out.println(n.s2);
		// n.blow();// nullpointerexception
		example e = new example();
		e.blow();
		e.sound();
	}
}
