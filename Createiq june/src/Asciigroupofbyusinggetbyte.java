
public class Asciigroupofbyusinggetbyte {
	public static void main(String[] args) {
		String s1 = "mahesh";
		// character converted into byte
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		
		byte[] arr1 = s2.getBytes();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		String s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] arr2 = s3.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}
}
