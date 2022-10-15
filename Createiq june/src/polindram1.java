
public class polindram1 {
	public static void main(String[] args) {
		int a = 123;
		int original = a;
		int reverse = 0;
		while (a != 0) {
			//0=0*10+3=3  :  3=3*10+2=32  :  32=32*10+1=321  
           reverse = reverse*10+ a % 10;
			a = a / 10;
			System.out.println(reverse);
			System.out.println(a);
		}
			if (original == reverse) {
				System.out.println("polindram");
			}else {
				System.out.println("not polindram");
			}
		
	}
}
