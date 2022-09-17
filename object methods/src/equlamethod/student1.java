package equlamethod;

public class student1 {
	int id;
	String name;
	protected student1(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}
	//	in that OVERRIDE EQUALS method is working
	//  override ".EQUALS" is only " CONTENT COMPARSION" only
	@Override
	public boolean equals(Object obj) {
           student1 s=(student1) obj;
		if(name.equals(s.name) && id==s.id) {
			return true;
		}else {
			return false;
		}
		}
	public static void main(String[] args) {
		student1 s1=new student1(01, "mahesh");
		student1 s2=new student1(02, "siva");// true...CONTENT COMPARSION
		student1 s3=new student1(01, "mahesh");// true
		student1 s4=s1;
		student1 s5=new student1(02, "siva");// true...CONTENT COMPARSION
		student1 s6=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));// true...CONTENT COMPARSIO
		System.out.println(s1.equals(s4));//true
		System.out.println(s2.equals(s5));// true...CONTENT COMPARSIO
		System.out.println(s2.equals(s6));//true
	//	in that OVERRIDE EQUALS method is working
		//  override ".EQUALS" is only " CONTENT COMPARSION" only
	}
}
