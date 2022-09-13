package SeqenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		// try with resource
		try (FileInputStream f1 = new FileInputStream("src/SeqenceInputStream/address.txt");
				FileInputStream f2 = new FileInputStream("Department");
				FileInputStream f3 = new FileInputStream("empolyee.txt");
				) {
			Vector v1 = new Vector();
//			v1.add(1235421);// class cast Exception
//			v1.add("mahesh");
			v1.add(f1);
			v1.add(f2);
			v1.add(f3);
			System.out.println(v1);
			// creating enumeration object by calling the elements method
			Enumeration e = v1.elements();
			// itterate each element the we go Sequencial
			SequenceInputStream bin = new SequenceInputStream(e);
			int i = 0;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void While(boolean hasMoreElements) {
		// TODO Auto-generated method stub

	}
}
