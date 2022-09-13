package example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import FileReader.fileReader;
import filewriter.filewriter;

public class testStudent {
	public static void main(String[] args) throws IOException {
		address a1 = new address("paloknda0", 532445, "andhra pradesh");
		address a2 = new address("paloknda1", 532435, "uttar pradesh");
		address a3 = new address("paloknda2", 532445, "telangana");
		address a4 = new address("paloknda3", 532445, "manipur ");
		address a[] = { a1, a2, a3 };
		FileWriter fa = new FileWriter("address.txt");
		BufferedWriter ba = new BufferedWriter(fa);
		for (address address : a) {
			ba.write(address.toString());
			ba.newLine();
		}
		student s1 = new student(01, "mahesh", 25000, a1, gender.MALE);
		student s2 = new student(02, "raja", 25000, a2, gender.FEMALE);
		student s3 = new student(03, "ravi", 25000, a3, gender.MALE);
		student s4 = new student(04, "rupa", 25000, a4, gender.FEMALE);
		student s5 = new student(04, "abcd", 25000, a1, gender.MALE);
		student[] s = { s1, s2, s3, s4, s5 };
		FileWriter fs = new FileWriter("student.txt");
		BufferedWriter bs = new BufferedWriter(fs);

		for (student student : s) {
			bs.write(student.toString());
			bs.newLine();
		}
		
		System.out.println("success2");
		ba.flush();
		bs.flush();
		ba.close();
		bs.close();

	}
}
