package importantprogram;

public class testStudent2 {
	public static void main(String[] args) {
		student s1 = new student(01, "mahesh", 25000);
		student s2 = new student(02, "mahesh", 25000);
		student s3 = new student(03, "mahesh", 25000);
		student s4 = new student(04, null,0);

		student[] s = { s1, s2, s3, s4 };
		for (student students : s) {

				// throw the Exception
				if(students.getId() == 0) {
				try {
			     System.out.println(" id are INVALID details");
					throw new IllegalAccessException("id should not be Zero");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			// throw the Exception
			if (students.getName() == null) {
				System.out.println(" name are INVALID details");
				try {
				throw new NullPointerException("id should not be Zero");
				}catch(Exception e) {
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
			System.out.println(students);
		
	}
}
}