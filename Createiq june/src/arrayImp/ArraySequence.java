package arrayImp;

public class ArraySequence {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 7, 8, 9, 10, 11, 12 };
		for (int i = 0; i < arr.length - 3; i++) {
			if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2] && arr[i + 2] + 1 == arr[i + 3]) {
				System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2] +" "+arr[i+3]+"  serial");
			}
		}
	}
}
