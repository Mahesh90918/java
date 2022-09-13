package filenotfoundexp;

import java.io.File;

public class example {
public static void main(String[] args) {
	File f= new File("D:\\innerclassess");

	if(f.exists()) {
		System.out.println("file name ;"+f.getName());
		System.out.println("file location ;"+f.getAbsolutePath());
		System.out.println("file write ;"+f.canWrite());
		System.out.println("file size ;"+f.length());
		System.out.println("file name ;"+f.getName());
		System.out.println("file parent ;"+f.getParent());
		System.out.println("file Totalspace ;"+f.getTotalSpace());
		System.out.println("file path ;"+f.getPath());
		System.out.println("file toString ;"+f.toString());
		System.out.println("file exist ;"+f.exists());
		System.out.println("file exist ;"+f.getAbsoluteFile());
	// format data	System.out.println("file delete ;"+f.delete());
		
	}else {
		System.out.println("....file not found....");
	}
}
}
