package methodoverriding;

public class C extends B {
	String name;

	protected C(int a, int b, String name) {
		super(a, b);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("name  " + name);
	}

}
