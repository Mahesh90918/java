package array;

public class Aray2d {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 7 }, { 3, 9, 4 }, { 8, 9, 0 } };
		for (int i = 0; i < a.length; i++) 
		{
			// a.length or exact value of row
			for (int j = 0; j < 3; j++) {

				System.out.print(a[i][j]+" ");
			}
			System.out.print("");
		}
	}

}
