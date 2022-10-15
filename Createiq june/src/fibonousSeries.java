
public class fibonousSeries {
	public static void main(String[] args) {
		
 int l=0;
 int m=1;
 int k=0;
 for (int i = 0; i < 10; i++) {
	k=l+m;
	l=m;
	m=k;
	System.out.println(k);
}
	}
 
}
