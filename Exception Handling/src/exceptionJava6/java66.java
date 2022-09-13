package exceptionJava6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java66 {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("D://file.txt");
	    try {
	    	
	    	String s="mahesh is created new file";
	    	byte  [] b=s.getBytes();// String converts bytes type
			f.write(b);
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
