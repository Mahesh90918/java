package files;

import java.io.File;
import java.io.IOException;

public class file1 {
public static void main(String[] args) throws IOException {
	File f2 = new File("/JavaIOStreams/mahesh3050.txt");
	System.out.println(f2.getParent());
	System.out.println(f2.getAbsolutePath());
	System.out.println(f2.exists());
	
	if(f2.exists()) {
		System.out.println("gnsdfh");
	}else {
		System.out.println("asdfgh");
	}
//	System.out.println(f2.createNewFile());
	
}
}
