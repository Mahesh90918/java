package importantprogram;

public class teststudent4 {
	public static void main(String[] args) {
	student s1 = new student(01, "mahesh", 25000);
	student s2 = new student(02, "mahesh", 25000);
	student s3 = new student(03, "mahesh", 25000);
	student s4 = new student(04, null, 2500);
	student s5 = new student(05, "", 2500);
	student s6 = new student(06, " ", 2500);
	student s7 = new student(07, "siva", 2500);

	student[] s = { s1, s2, s3, s4, s5, s6,s7 };
	for (student students : s) {
		// throw the Exception
		if (students.getId() == 0) {
			try {
				System.out.println(" id are INVALID details");
				throw new IllegalAccessException("id should not be Zero");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (students.getFee() == 0) {
			try {
				throw new IllegalAccessException("fee should not be Zero");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	

		// 2. method use one method
//		try {
//			// nullpointerException
//			// its check total problem on Strings
//			if (students.getName().isBlank()) {
//				throw new IsBlankException("is blank");
//			}
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
		// 3. method
			try {
				if(students.getName().isBlank()||students.getName().isEmpty()) {
			throw new IsBlankException("Either blank or Empty");
				}
			}catch(RuntimeException e) {
				e.printStackTrace();
		}
		
		System.out.println(students);

	}
}
}
