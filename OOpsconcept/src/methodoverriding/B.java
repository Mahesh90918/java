package methodoverriding;

public class B extends A {
	protected B(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

	void animal(){
		System.out.println("cat");
	}

}
