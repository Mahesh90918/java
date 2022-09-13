package methodChanning;

public class constractorChaining {
	public constractorChaining() {
		this(3);
		System.out.println("constructor Chaining");
	}

	public constractorChaining(int a) {
		
		this(2, 3);
		System.out.println(a);
		System.out.println("2 nd constructor Chaining");
	}

	public constractorChaining(int a, int b) {
		this(2,3,4);
		System.out.println("a+b="+(a+b));
		System.out.println("3 rd constructor Chaining");
	}

	public constractorChaining(int a, int b, int c) {
		System.out.println("a+b+c="+(a+b+c));
		System.out.println("4 th constructor Chaining");
	}public static void main(String[] args) {
		constractorChaining c=new constractorChaining();
		
	}
}
