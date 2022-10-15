package array;

public class array2ddd {
	public static void main(String[] args) {
		int a[][]= {{1,2},{4,5}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}System.out.println("....for each....");
	for(int []x:a) {
		for(int y:x) {
			System.out.print(y+" ");
		}System.out.println();
	}
	}

}
