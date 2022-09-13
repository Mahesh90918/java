package filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filewr3 {
	public static void main(String[] args) {
		File f= new File("D:\\mahesh");
		try {
			FileOutputStream fw=new FileOutputStream(f);
			//fw.write(100);// valid
			//println==write ()+flash() combination
			//System.out.write(100);// valid
			fw.write('A');
			String s="\n"+"fileWriter creates";
			byte [] b=s.getBytes();
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
