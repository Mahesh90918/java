package mahesh;
public class myrunable implements Runnable {

	public void m1() {
		System.out.println("mahesh");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" run method ");
	}public static void main(String[] args) {
		myrunable m= new myrunable();
		Thread t1 =new Thread();
		t1.run();
	
		
		// passing arugements
		
		Thread t2 =new Thread(m);
		t2.run();
		//m.run();
		m.m1();
		
		
		
}
}