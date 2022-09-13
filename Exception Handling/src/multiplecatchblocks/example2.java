package multiplecatchblocks;

import java.io.FileNotFoundException;

public class example2 {
public static void main(String[] args) {
	try {
		//System.out.println(10/0);
		String s= null;
		System.out.println(s.length());
	}catch(ArithmeticException | NullPointerException e) {
		e.printStackTrace();
	}catch(ClassCastException|NoClassDefFoundError e) {
		e.printStackTrace();
	}
}
}
