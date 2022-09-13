package importantprogram;

public class testStudent {
public static void main(String[] args) {
	student s1= new student(01, "mahesh", 25000);
	student s2= new student(02, "mahesh", 25000);
	student s3= new student(03, "mahesh", 25000);
	student s4= new student(04, null, 00.0);
	
	student [] s= {s1,s2,s3,s4};
	for (student students : s) {
		if (students.getId()== 0) {
			System.out.println(" id are INVALID details");
		}
		if ( students.getName()== null) {
			System.out.println(" name are INVALID details");
		}
		if (students.getFee() == 0.0) {
			System.out.println(" fee are INVALID details");
		}
		System.out.println(students);
	}
}
}