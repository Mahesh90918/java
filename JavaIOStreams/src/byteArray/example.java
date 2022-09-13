package byteArray;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class example {
	int i;
	String name;

	public example(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	@Override
	public String toString() {
		return "example [i=" + i + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		example e1 = new example(01, "mahesh");
		example e2 = new example(02, "mahesh");
		example e3 = new example(03, "mahesh");
		example e[] = { e1, e2, e3 };
		try {
			BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream("empolye111.txt"));
			for (example example1 : e) {
				byte[] b1 = example1.toString().getBytes();
				b.write(b1);
				String lineSeparator=System.getProperty("line.separator");
				b.write(lineSeparator.getBytes());
			}
			b.flush();
			b.close();
			System.out.println("sucess");
		} catch (IOException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}

	}
}
