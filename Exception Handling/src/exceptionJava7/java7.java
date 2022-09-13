package exceptionJava7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java7 {
	public static void main(String[] args) {
		File f = new File("D:\\\\Java work space\\\\Exception Handling\\\\src\\\\filenotfoundexp\\\\newfile.txt");
		// try with resource
		// once try block is completed automatically resource closed explicitly
		try (FileInputStream fis = new FileInputStream(f);) {
			// read only
//			int i= fis.read();
//			System.out.println(i);

// read the all data
			int i = 0;
			while ((i = fis.read()) != -1) {
				//System.out.print(i); // read byte type
				System.out.print((char) i); // read char type
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("complete");
	}
}