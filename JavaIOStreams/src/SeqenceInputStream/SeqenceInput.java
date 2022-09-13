package SeqenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqenceInput {
public static void main(String[] args) throws IOException {
	FileInputStream f1=new FileInputStream("address.txt");
	FileInputStream f2=new FileInputStream("Department");
	// reading the data into bytes format
	//SequenceInputStream is only reads two objects only
	//why because we go with SequenceInputStream enumaration
	SequenceInputStream seq= new SequenceInputStream(f1, f2);
	System.out.println(seq.available());
	int i=0;
	while((i=seq.read())!=-1) {
		System.out.print((char)i);
	}
}
}
