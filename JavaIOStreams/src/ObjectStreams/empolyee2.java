package ObjectStreams;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class empolyee2 {

	int i;
	String name;

	public empolyee2(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectOutputstream [i=" + i + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		empolyee2 s1 = new empolyee2(01, "mahesh");
		empolyee2 s2 = new empolyee2(02, "mahesh");
		empolyee2 s3 = new empolyee2(03, "mahesh");
		empolyee2 s4 = new empolyee2(04, "mahesh");
		empolyee2 [] s= {s1,s2,s3,s4};
		BufferedWriter b=null;
		try {
			FileWriter f=new FileWriter("empolyee2data.txt");
			 b=new BufferedWriter(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("sucess");
	 try {
		ObjectInputStream ob=new ObjectInputStream(new FileInputStream("empolyee.txt"));
	       System.out.println(  ((ObjectInput) s1).readObject());
	   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
