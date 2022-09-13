package example3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class duplicate {
	public static void main(String[] args) throws IOException {
		PrintWriter f = new PrintWriter("data5&6");
		BufferedReader b = new BufferedReader(new FileReader("D://file1"));
		String line1 = b.readLine();
		while (line1 != null) {
			boolean Available = false;
			BufferedReader b1 = new BufferedReader(new FileReader("data5&6"));
			String target = b1.readLine();
			while (target != null) {
				if (line1.equals(target)) {// both are same then not print
					Available = true;// dont print
					break;
				}
				target = b1.readLine();
			}
			if (Available == false) {// both are not same then print
				f.write(line1);
				f.write("\n");
				f.flush();
				System.out.println(line1);
			} else {
				System.out.println("fdshfd");
			}
			line1 = b.readLine();
		}
		System.out.println("sucessful");

	}
}