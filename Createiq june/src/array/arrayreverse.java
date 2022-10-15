package array;

import java.util.Arrays;

public class arrayreverse {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 4, 15, 6, 7,9 };
		//only print the array same sequence order only toString method used
		System.out.println(Arrays.toString(arr));
	//	sort method Assessinding order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
			
		
	//	array reverse method
//		int n = arr.length;
//        for (int i = n-1; i >=0; i--) {
//        	//for()
//			System.out.print(arr[i]);
//	}

	}
}
