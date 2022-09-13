package Example4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class example {
	public static void main(String[] args) throws IOException {
		
	File f = new File("ABC");
	System.out.println(f.mkdir());
	File f1 = new File("ABC","abc.txt");
	System.out.println(f1.createNewFile());
	File f2 = new File("JavaIOStreams/ABC/abc.txt");
	System.out.println(f2.exists());
	System.out.println(f2.getAbsolutePath());
	
	BufferedWriter p=new BufferedWriter(new FileWriter(new File(f,"abc.txt")));
	p.write(100);
	p.newLine();
	String s="mahesh is creates new file Stored in the ABC directory ";
	byte[]b=s.getBytes();
	p.write(s);
	p.flush();
	p.close();
	
}
}
