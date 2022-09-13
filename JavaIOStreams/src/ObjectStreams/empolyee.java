package ObjectStreams;

import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import filewriter.filewriter;

public class empolyee implements Serializable {

	int i;
	String name;

	public empolyee(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectOutputstream [i=" + i + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		empolyee s= new empolyee(01, "mahesh");

		try {
			FileOutputStream file1 = new FileOutputStream("file1.txt");
			ObjectOutputStream files1 = new ObjectOutputStream(file1);
			files1.writeObject(s);
			files1.close();
			FileInputStream file = new FileInputStream("file1.txt");
			ObjectInputStream files = new ObjectInputStream(file);
			// Reads the objects
			empolyee ss = (empolyee) files.readObject();
			// Using the readInt() method
			System.out.println("Integer data :" + ss.i);

			// Using the readObject() method
			System.out.println("String data: " + ss.name);
			files.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
