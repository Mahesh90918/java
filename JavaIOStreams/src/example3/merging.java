package example3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class merging {
	public static void main(String[] args) throws IOException {
		
		// one by one printing
		//one compled then other one starts the printing
		PrintWriter p = new PrintWriter("data1&2.txt");
		BufferedReader br = new BufferedReader(new FileReader("D://mahesh"));
		String line1 = br.readLine();
		while (line1 != null) {
		//	p.println(line1);
			p.write(line1);
			p.print(1000);
			//System.out.println(line1);
			p.write("\n");
			line1 = br.readLine();
		}
		br = new BufferedReader(new FileReader("D://mahesh"));
		String line12 = br.readLine();
		while (line12 != null) {
			//p.println
			p.write(line12);
			p.print(101);
			//System.out.println(line12);
			p.write("\n");
			line12 = br.readLine();
		}

		System.out.println("success1");
		p.flush();
		br.close();
		p.close();

	}
}
