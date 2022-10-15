package array;

public class Arrayadding {
	public static void main(String[] args) {
		int[] array = { 12, 34, 56, 78, 90 };
		
		int sum=0;
		for(int i=0;i<array.length;i++) {
			
			sum=array[i]+sum;//12+34+56+....like that
			System.out.println(sum);//value by value
			
		}
		System.out.println(sum);//total
		
	}
		
		
	}