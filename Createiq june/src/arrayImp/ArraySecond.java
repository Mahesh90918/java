package arrayImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySecond {
	public static void main(String[] args) {
		int arr[] = { 11, 222, 333, 111, 5555, 5556, 666, 77, 6666 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Second Highest");
		System.out.println(arr[arr.length - 2]);

		System.out.println("............list..........");
		Integer arr1[] = { 11, 222, 333, 111, 5555, 5556, 666, 77, 6666 };
		List list = Arrays.asList(arr1);
		Collections.sort(list);
		int element = (int) list.get(arr1.length - 2);
		System.out.println(element);

	}
}
