package array;

public class ARRmethodcall {
	int a[]= {2,3,4,5,6};
	public int display() {
		int mul=1;
	for(int i=0;i<a.length;i++) {
		mul=a[i]*mul;
		System.out.println(mul);//value by value
	}
	return mul;
	}
	// Array calls in the method
 public static void main(String[] args) {
	ARRmethodcall array=new ARRmethodcall();
	System.out.println(array.display());
}
}

