package array;

public class array1 {
public static void main(String[] args) {
	int arr[]=new int[6];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	arr[5]=6;
	
	//for loop
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	//for each loop  
	for (int a:arr) {
		System.out.print(a);
	}
	
}
}
