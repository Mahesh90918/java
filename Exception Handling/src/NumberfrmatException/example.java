package NumberfrmatException;

public class example {
public static void main(String[] args) {
	
	
	int i=Integer.parseInt("100");// valid
	System.out.println(i);
	int i1=Integer.parseInt("abc");// invalid
	System.out.println(i1);
	
	int i2= new  Integer("100");// valid
	System.out.println(i2);
	int i3= new  Integer("abc");//invalid
	System.out.println(i3);
}
}
