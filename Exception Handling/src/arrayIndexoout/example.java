package arrayIndexoout;

public class example {
public static void main(String[] args) {
	int arr[]=new int[10];
	arr[9]=10;
	System.out.println(arr[9]);
	arr[-9]=10;
	System.out.println(arr[-9]);
	arr[10]=100;
	System.out.println(arr[10]);
	
}
}
