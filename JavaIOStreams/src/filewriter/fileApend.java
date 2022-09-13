 package filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileApend {
	public static void main(String[] args) {
		
	File f= new File("D:\\mahesh");
	try {
		FileOutputStream fw=new FileOutputStream(f, true);
		String s="\n";
		byte [] b1=s.getBytes();
		fw.write(b1);
		fw.write('A');
		String s1="\n"+"fileWriter creates";
		byte [] b=s1.getBytes();
		fw.write(b);
		System.out.println("sucess");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

