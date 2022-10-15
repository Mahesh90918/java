import java.util.Scanner;

public class ASCIIVALUE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character");
	char c=sc.next().charAt(0);
	System.out.println("Enter digit");
	int in=sc.nextInt();
	for(int i=0;i<1;i++) {
		System.out.println("value of chacter :"+(byte)c);
		System.out.println("value of number :"+(char)in);
		//System.out.println((double)c);
	//	System.out.println((int)c);

	}
}
}
