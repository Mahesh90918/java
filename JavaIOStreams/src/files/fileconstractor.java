package files;

import java.io.File;
import java.io.IOException;

public class fileconstractor {
// file constructors are 3 types

	public static void main(String[] args) {
		
		// 1. first Constructor
		// File f=new File(String name);
// these are Abstract class
		File f = new File("abc.txt");
		System.out.println(f.exists());// false there is no file is available
		// when we use the createNewFile method on that time create file
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // true

	}
}
