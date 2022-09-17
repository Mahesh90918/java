package equlamethod;

public class student {

	int id;
	String name;
	protected student(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}
	public static void main(String[] args) {
		student s1=new student(01, "mahesh");
		student s2=new student(02, "siva");
		student s3=new student(01, "mahesh");
		student s4=s1;
		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equals(s3));// false
		System.out.println(s1.equals(s4));//true ...." REFERENCE COMPARSION" only 
	//	in that OBJECT EQUALS method is working
		//  object ".EQUALS" is only " REFERENCE COMPARSION" only
	}
}
