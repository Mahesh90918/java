package byteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;

public class Student {
	int id;
	String name;
	double fee;

	public Student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(01, "vigananyaka", 25000);
		Student s2 = new Student(02, "ganesh", 25000);
		Student s3 = new Student(03, "vinayaka", 25000);
		Student s4 = new Student(04, "ganapathi", 25000);
		Student s5 = new Student(05, "mahesh", 25000);
		Student s[] = { s1, s2, s3, s4, s5 };
		ByteArrayOutputStream b = null;

		try {
			FileOutputStream file = new FileOutputStream("address.txt");
			FileOutputStream file1 = new FileOutputStream("vinayaka.txt");
			b = new ByteArrayOutputStream();
			for (Student student : s) {
				b = new ByteArrayOutputStream();
				file1.write(student.toString().getBytes());
				file1.write(student.getId());
				//file1.write(student.getName().getBytes());
				
				b.flush();
				System.out.println(file);
			}
			file.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
