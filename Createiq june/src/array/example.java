package array;

import java.util.ArrayList;
import java.util.ListIterator;

public class example {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);

	
		 ListIterator<Integer> it = a.listIterator();
		
	        System.out.println("Calling it.nextIndex() " + it.nextIndex());
	        System.out.println("Calling it.previousIndex() " + it.previousIndex());
	        // Add 11 using ListIterator
	        it.add(11);

	        System.out.println("\nAdding using it.add(11)");
	        System.out.println("\nCalling it.nextIndex() " + it.nextIndex());
	        System.out.println("Calling it.previousIndex() " + it.previousIndex());

	        System.out.println("The array list is  " + a);
	    }
	}

