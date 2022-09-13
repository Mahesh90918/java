package methodChanning;

public class methodChanning {
	
	// method chaining
	//methodChanning
	public void m1() {
		System.out.println("method m1");
	
	}

	private void m2() {
		m1();
		System.out.println("method m2");
	

	}

	public void m3() {
		m1();
		m2();
		System.out.println("method m3");

	}public static void main(String[] args) {
		methodChanning method=new methodChanning();
		method.m3();
	}
}
