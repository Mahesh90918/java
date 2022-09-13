package files;

import java.io.File;
import java.io.IOException;

public class secondconstr {
	public static void main(String[] args) throws IOException {
		// 2. second Constructor
		// File f=new File(String Sub-directortyName,String name);
		//3.third constractor
		// File f=new File(File f,String name);
		File f= new File("mahesh3050.txt");
		// use the mkdir method  new make a directory
		 System.out.println(f.mkdir());
		 File f2=new File("mahesh3050.txt","abcde.txt");
		 System.out.println(f2.createNewFile());
         
		File f1 = new File(f, "abcd.txt");

		System.out.println(f1.createNewFile());

		System.out.println(f1.exists());

	}
}
