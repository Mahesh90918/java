package FileReader;

import java.io.FileInputStream;
import java.io.InputStream;

public class file4 {
	 public static void main(String args[]) {

		    byte[] array = new byte[150];// how many bytes read only 150

		    try {
		      InputStream input = new FileInputStream("src/FileReader/address.txt");

		      System.out.println("Available bytes in the file: " + input.available());

		      // Read byte from the input stream
		      input.read(array);
		      System.out.println("Data read from the file: ");

		      // Convert byte array into string
		      String data = new String(array);
		      System.out.println(data);

		      // Close the input stream
		      input.close();
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
		  }
}
