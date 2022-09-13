package FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileReader {
	// FileInputStream is used to only read the data operation
	public static void main(String[] args) {
		try {
			//FileInputStream fi=new FileInputStream("D://mahitxt");
			FileInputStream fi=new FileInputStream("src/FileReader/address.txt");
		System.out.println("Available bytes in the file: " + fi.available());// characters
			int i=0;
			while((i=fi.read()) !=-1) {// while is used to
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
