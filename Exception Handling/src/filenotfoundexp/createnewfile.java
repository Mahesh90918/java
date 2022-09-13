package filenotfoundexp;

import java.io.File;
import java.io.IOException;

public class createnewfile {
	public static void main(String[] args) {
		File f = new File("a.text");
		if (f == null) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("file already exists");
		}
		File f1 = new File("newfile.txt");
		if (f1 == null) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("file already exists");

		}
	}
}