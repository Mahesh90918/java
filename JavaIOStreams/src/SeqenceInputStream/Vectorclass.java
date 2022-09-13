package SeqenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
public class Vectorclass {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("src/SeqenceInputStream/address.txt");
			FileInputStream f2 = new FileInputStream("Department");
			FileInputStream f3 = new FileInputStream("empolyee.txt");
			
			//creating Vector object to all the stream 
			// read more than two objects
			//Enumeration object can be obtained by calling elements() 
			//method of the Vector class.
			Vector v= new Vector();
			// all type of data is Stroing in the vector class add() 
			//like All data types,Strings,Object
			// Stores Both primitive and non-primitive data Stores
			// we can Stores Hetrogenious and Homogenious Data
			v.add(f1);
			v.add(f2);
			v.add(f3);
		//	v.add(123);
			//v.add("mahesh");
		//	v.add('m');
		//	v.add(true);
		//	v.add(new empolyee(01, "mahesh"));
			System.out.println(v);// Stroes the Array format(toString format)
			//[java.io.FileInputStream@69222c14, java.io.FileInputStream@606d8acf,
			//java.io.FileInputStream@782830e, 123, mahesh, m, true]
			// only String is seen is console
//			for (Object vector : v) {
//				System.out.println(vector);
//			}
	
			
			//creating enumeration object by calling the elements method    
			Enumeration enum1=v.elements();  
//			while (enum1.hasMoreElements()) {
//				System.out.println(enum1.nextElement());
//			}

			//passing the enumeration object in the constructor    
			SequenceInputStream bin=new SequenceInputStream(enum1);
//			System.out.println(bin.available());
//			System.out.println(bin.skip(198));
			int i=bin.read();
			while((i)!=-1) {
				System.out.print((char)i);
				i=(int)bin.read();
				
			}
			
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
