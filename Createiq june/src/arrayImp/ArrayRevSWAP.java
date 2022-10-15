package arrayImp;

public class ArrayRevSWAP {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int temp = 0;
		System.out.println("swap Approach");
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("normal Approach");
		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] + " ");
		}
	}
}
