package forloop;

public class for11 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 9, 8, 9 } ,{2,3,4}};
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2);

			}
			System.out.println();

		}

	}
}
