package Hascode;

public class test3 {
 int i;

protected test3(int i) {
	super();
	this.i = i;
}
 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+" ";// calls to strings only
	}
 public static void main(String[] args) {
	test3 t1=new test3(10);
	test3 t2=new test3(100);
	System.out.println(t1);//10 hascode
	System.out.println(t2);// 100 hascode
	//test=tostring;
	// test=hascode;
	
	// in this test class i am creating the tostring method and hascode method
	// these methods calls internally
}
}
