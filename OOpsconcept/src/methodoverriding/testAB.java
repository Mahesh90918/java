package methodoverriding;

public class testAB {
	public static void main(String[] args) {

		B a = new B(1,2);
		a.animal();
		a.display();
		
		B c=new C(1, 3, "mahi");
		c.display();
		A d=new C(3, 5, "siva") ;
		d.display();
		A f=new B(1, 5);
		f.display();
		
	}
}
