package arraycopy;

import java.util.Arrays;

public class example {
	/**
	 * Formulas
	 * arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
	 * 
	 * rules;
	 * 1.src - source array you want to copy
	 * 2. srcPos - starting position (index) in the source array 
	 * 3. dest - destination array where elements will be copied from the source
	 * 4. destPos - starting position (index) in the destination array 
	 * 5.length -number of elements to copy
	 */
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int arr1[]=new int[6];
		// Creating arr2 array of having length of arr array
		int arr2[]=new int[arr.length];
		
		 // copying entire n1 array to n2
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.out.println("n2 = " + Arrays.toString(arr1));  
      
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(arr, 2, arr2, 1, 2);
        System.out.println("n3 = " + Arrays.toString(arr2));
        
        
        System.arraycopy(arr,2,arr2,0,4);
        System.out.println("n3 = " + Arrays.toString(arr2));
		
		
	}
}