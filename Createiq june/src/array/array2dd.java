package array;

public class array2dd {
	public static void main(String[] args) {
		System.out.println("....normal for .....");

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("......next for each .........");
		// for each type
		for (int x[] : arr) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}
