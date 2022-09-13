package imageReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class image {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new  FileInputStream("C:\\Users\\user\\OneDrive\\Pictures\\Screenshots");
		SequenceInputStream si = new SequenceInputStream(fis,
				new FileInputStream("employee3.txt"));
		int  br=fis.read();
		
		FileOutputStream fo=new FileOutputStream("123.jpg");
		
		int bs=fis.read();
		
		int j;
//		while((j=(fo.write(bs))!=-1){
//			System.out.println((char)j);
//		}
		while ((j = si.read()) != -1) {
			System.out.print((char) j);
		
		}
		si.close();
	}

	}

