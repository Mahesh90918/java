
public class normal {
	int a = 100;

	static void add(int a) {
		normal t = new normal();

		System.out.println(t.a);
	}

	public static void main(String[] args) {
		normal t = new normal();
		t.add(10);
	}
}
