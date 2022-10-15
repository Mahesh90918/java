package array;

public class Arraymul {
	public static void main(String[] array) {
		int Array[]= {2,3,4,5,6,7};
		int mul=1;
		for(int i=0;i<Array.length;i++) {
			//mul=Array[i]*Array[i];// mul=2*2,3*3,4*4.....like that
			
			mul=Array[i]*mul;//mul=2*3*4*5*6*.....like that
			System.out.println(mul);// value by value
		}System.out.println(mul);//total
	}

}
