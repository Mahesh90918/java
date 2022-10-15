
package array;

public class maxnumber {
public static void main(String[] args) {
	int arr[]= {55,70,344,40,5,6};
	int max=arr.length;
	for(int i=0;i<arr.length;i++) {
		if(max>arr[i]) {
			max=arr[i];
		}
	}System.out.println(max);
}
}
