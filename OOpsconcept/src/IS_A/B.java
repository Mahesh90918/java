package IS_A;

public class B extends A implements IS_AA{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("eat");
	}
public static void main(String[] args) {
	 B b= new B();
	 b.eat();
	 b.sleep();
	 b.talk();
}
@Override
void talk() {
	// TODO Auto-generated method stub
	System.out.println("talk");
}
}
