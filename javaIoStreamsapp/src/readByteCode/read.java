package readByteCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class read {
		public static byte[] readFile(String file) throws IOException {
			 
			   File f = new File("D:\\\\maheshtxt.txt");
			 
			   // work only for 2GB file, because array index can only up to Integer.MAX
			 
			   byte[] buffer = new byte[(int)f.length()];
			 
			   FileInputStream is = new FileInputStream(file);
			 
			   is.read(buffer);
			 
			   is.close();
			 
			   return  buffer;
			 
			}public static void main(String[] args) throws IOException {
				read.readFile("D:\\maheshtxt.txt");
			}


	}
