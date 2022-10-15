package arrayImp;

public class DuplicateElements1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 30, 20, 40, 50, 40 };
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[len - 1];
					len--;

				}
			}
		}
		System.out.println("with out repetation");
		for (int j2 = 0; j2 < len; j2++) {
			System.out.print(arr[j2] + " ");
		}
	}

}
