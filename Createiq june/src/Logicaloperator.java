
public class Logicaloperator {
	public static void main(String[] args) 
	{
		int a=65;
		int b=32;
		int c=54;
		int d=32;
		System.out.println(a>b&&c>d);// if b0th are true
		System.out.println(a<b&&c>d);//any one is false =false
		System.out.println(a>b||c>d);//any one is true
		System.out.println(a<b||c>d);// any one is true
		System.out.println(a<b||c<d);// every condition is false 
	}

}
