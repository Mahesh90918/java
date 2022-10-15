package array;

import java.util.Arrays;

public class swap {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

//	 String s="welcome java code";
//	 String s1[]=s.split(" ");
//	 for (int i = 0; i < s1.length; i++) {
//		System.out.println(s1[i]);
//	}
	}

}
