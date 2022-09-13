package example3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class alternatively {
	public static void main(String[] args) throws IOException {

		/*
		 * To clear the output stream, we can use the flush() method. This method forces
		 * the output stream to write all data to the destination
		 */
		PrintWriter p = new PrintWriter("data3&4");
		BufferedReader b = new BufferedReader(new FileReader("D://mahesh"));
		BufferedReader b1 = new BufferedReader(new FileReader("D://mahesh"));
		// line by line printing
		String line1 = b.readLine();
		String line2 = b1.readLine();
		while ((line1 != null) || (line2 != null)) {
			// if is used
			if (line1 != null) {
				p.write(line1);
				p.print(100);
				p.write("\n");
				line1 = b.readLine();
			}
			if (line2 != null) {
				p.write(line2);
				p.print(101);
				p.write("\n");
				line2 = b1.readLine();
			}

		}
		System.out.println("success");
		p.flush();
		p.close();
		b.close();
		b1.close();
	}

}
