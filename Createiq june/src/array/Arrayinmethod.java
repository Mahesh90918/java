package array;

public class Arrayinmethod {
	int array[] = { 23, 34, 45, 54 };

	public int display() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			 sum= array[i] + sum;
			System.out.println(sum);
		}//		System.out.println(sum);
		return sum;
	}
	

	// Array calls in the method

	public static void main(String[] args) {
		Arrayinmethod A = new Arrayinmethod();
		//A.display();
		System.out.println(A.display());

	}
}
