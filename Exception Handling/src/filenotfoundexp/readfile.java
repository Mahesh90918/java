package filenotfoundexp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
	public static void main(String[] args) {
		File file = new File("D:\\Java work space\\Exception Handling\\src\\filenotfoundexp\\newfile.txt");
		Scanner myReader = null;
		try {
			myReader = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();

			System.out.println(data);
		}

	}
}
