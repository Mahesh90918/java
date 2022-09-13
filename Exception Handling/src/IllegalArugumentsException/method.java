package IllegalArugumentsException;

public class method {
// if  you are invoking the method with will get IllegalArugumentsException
	
	public static void main(String[] args) {
		Thread t=new Thread();
		// the actual range of setPriority  is 1 to 10
		t.setPriority(10);
		t.setPriority(16);
	}
}
