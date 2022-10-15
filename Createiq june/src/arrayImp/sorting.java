package arrayImp;

import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 6, 5, 8, 9,10, 3, 2, 4 };
		// 1. way
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {// must
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println(arr.length - 1);//second

	}
}
