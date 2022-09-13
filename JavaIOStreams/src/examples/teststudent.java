package examples;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



import FileReader.fileReader;

public class teststudent {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs=new FileOutputStream("empolyee.txt");
		student s1 = new student(01, "mahesh", 20000);
		student s2 = new student(02, "mahesh", 20000);
		student s3 = new student(03, "mahesh", 20000);
		student s4 = new student(04, "mahesh", 20000);
		student[] s = { s1, s2, s3, s4 };
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fs));
		
		for (student student : s) {
			//fs.write(student.toString().getBytes());// single line
			bw.write(student.toString());
			bw.newLine();
		}System.out.println("success");
			bw.close();
			
		}
	}
