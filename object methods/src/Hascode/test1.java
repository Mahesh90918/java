package Hascode;

public class test1 {
int i;

protected test1(int i) {
	super();
	this.i = i;
}
public static void main(String[] args) {
	test1 t1=new test1(10);
	test1 t2=new test1(100);
	System.out.println(t1);//Hascode.test1@73a28541
     System.out.println(t2);//Hascode.test1@6f75e721
}
	
}
// obj=tostring;  // creates obj.tostring
//obj=hascode;    //creates obj.hascode



// object creates to string internally
// toting calls internally has code
//public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}