package example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class totaldata {
	public static void main(String[] args) throws IOException {

		PrintWriter p = new PrintWriter("totalstudentdata");
		BufferedReader br = new BufferedReader(new FileReader("address.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("student.txt"));
		String line1 = br.readLine();
		String line2 = br1.readLine();
		while (line1 != null || line2 != null) {
			// total data read then affer data read
			while (line1 != null) {
				p.write(line1);
				p.write("\n");
				line1 = br.readLine();
			}
			while (line2 != null) {
				p.write(line2);
				p.write("\n");
				line2 = br1.readLine();
			}

		}
		System.out.println("success1");
		p.flush();
		br.close();
		br1.close();
		p.close();
	}

}