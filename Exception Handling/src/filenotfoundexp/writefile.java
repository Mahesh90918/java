package filenotfoundexp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {
public static void main(String[] args) {
	File file= new File("D:\\Java work space\\Exception Handling\\src\\filenotfoundexp\\newfile.txt");
	try {
		FileWriter f=new FileWriter(file) ;
		 f.write(" i all how r u ");
		 System.out.println("sucessfully");
			f.close();
		}
	 catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
