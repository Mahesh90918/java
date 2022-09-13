package SeqenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import ObjectStreams.empolyee;

public class vector2 {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("vectordata.txt");
			FileInputStream f1 = new FileInputStream("address.txt");
			FileInputStream f2 = new FileInputStream("Department");
			FileInputStream f3 = new FileInputStream("empolyee.txt");
			Vector v= new Vector();
			v.add(f1);
			v.add(f2);
			v.add(f3);
			v.add(123);
			v.add("mahesh");
			v.add('m');
			v.add(true);
			v.add(new empolyee(01, "mahesh"));
			System.out.println(v);
			//creating enumeration object by calling the elements method    
			Enumeration enum1=v.elements();  
			//passing the enumeration object in the constructor    
			SequenceInputStream bin=new SequenceInputStream(enum1);
			int i=bin.read();
			while((i)!=-1) {
				System.out.print((char)i);
				f.write((char)i);
				i=(int)bin.read();
				
			}
			f.flush();
			bin.close();
			f1.close();
			f2.close();
			f3.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
