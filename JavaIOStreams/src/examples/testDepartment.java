package examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testDepartment {
	public static void main(String[] args) throws IOException {
		department d1 = new department("Ece", " cse", "EEE", " mech");
		department d2 = new department("Ece", " cse", "EEE", " mech");
		department d3 = new department("Ece", " cse", "EEE", " mech");
		department d4 = new department("Ece", " cse", "EEE", " mech");
		department d5 = new department("Ece", " cse", "EEE", " mech");
		BufferedWriter b = new BufferedWriter(new FileWriter("Department"));
		department[] d = { d1, d2, d3, d4, d5 };
		for (department department : d) {
			b.write(department.toString());
			b.newLine();
		}
		System.out.println("success");
		b.close();//must
	}
}
