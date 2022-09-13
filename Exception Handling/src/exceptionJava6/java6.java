package exceptionJava6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java6 {
	public static void main(String[] args) {
		File f = new File("D:\\\\Java work space\\\\Exception Handling\\\\src\\\\filenotfoundexp\\\\newfile.txt");
		FileInputStream fis = null;
		try {

			fis = new FileInputStream(f);
			int i = 0;
			try {
				while ((i = fis.read()) != -1) {// read the data with 0,1 byte values
					System.out.print((char)(i));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(f !=null) 
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("complete");
	}
}
