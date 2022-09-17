package Hascode;

public class test2 {
	int i;

	protected test2(int i) {
		super();
		this.i = i;
	}

// hascode method creating
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	public static void main(String[] args) {
		test2 t1 = new test2(10); // Hascode.test2@a
		test2 t2 = new test2(100); // Hascode.test2@64
		System.out.println(t1);
		System.out.println(t2);
		// obj=tostring;
		// test=hascode; // internally
		// object calls toString method but internally
		// calls override method on that class
	}
}
