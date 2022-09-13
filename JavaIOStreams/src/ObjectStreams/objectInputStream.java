package ObjectStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectInputStream {
	public static void main(String[] args) {

		int i = 10;
		String name = "mahesh";
		String name1 = "ganesh";

		try {
			FileOutputStream file = new FileOutputStream("src/ObjectStreams/objectInputStream.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);

			// Writing to the file using ObjectOutputStream
			output.writeInt(i);
			output.writeObject(name);
           output.writeObject(name1);
			FileInputStream fileStream = new FileInputStream("src/ObjectStreams/objectInputStream.txt");
			// Creating an object input stream
			ObjectInputStream objStream = new ObjectInputStream(fileStream);

			// Using the readInt() method
			System.out.println("Integer data :" + objStream.readInt());

			// Using the readObject() method
			System.out.println("String data: " + objStream.readObject());
			System.out.println("String data: " + objStream.readObject());

			output.close();
			objStream.close();

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
