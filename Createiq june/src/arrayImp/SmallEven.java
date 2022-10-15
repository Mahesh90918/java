package arrayImp;

public class SmallEven {
	public static void main(String[] args) {
		int arr[] = { 15, 10, 22, 8, 16, 32, 78, 45, 65, 6, 12, 33, 3, 4, 12, 2 };
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (temp > arr[i] && arr[i] % 2 == 0) {
				temp = arr[i];

			}
		}
		System.out.println(temp);
	}
}
