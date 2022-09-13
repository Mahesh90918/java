package filewriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	// FileOutputStream is used to only Write the data operation
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream f = new FileOutputStream("D://mahitxt");
			try {

				String s = "mahesh is created new fileWriter"+"\n";
				byte[] b = s.getBytes();// String converts bytes type
				f.write(b);
				
				f.write(100);//d
				System.out.println("sucessful");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
