package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file3 {
	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new FileReader("D:\\mahi.txt"));
		String line=b.readLine();
		while(line!=null) {
			System.out.println(line);
			line=b.readLine();
			
		}
		b.close();
		
	}
}
