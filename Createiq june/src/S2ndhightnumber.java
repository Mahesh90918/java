import java.util.Arrays;


public class S2ndhightnumber {

	public static int getsecond(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i; j < total; j++) {
//j=0 second lowest value
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2,57, 54, 67, 9, 8 };
		int b[] = { 87, 87, 655, 54, 86, 999 };
		System.out.println("second highest :" + getsecond(a, 7));
		System.out.println("second highest :" + getsecond(b, 6));
	}
}
