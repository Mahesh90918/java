package equlamethod;

public class student3 {
	int id;
	String name;
	protected student3(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}
	//	in that OVERRIDE EQUALS method is working
	//  override ".EQUALS" is only " CONTENT COMPARSION" only
	@Override
	public boolean equals(Object obj) {
		// According to both reference are pointing to the same objects the 
		//WITHOUT PERFORMING THE ANY COMPARISON .equals reference to return true
		if(obj==this) {
			return true;
		}
		if(obj instanceof student3) {
           student3 s=(student3) obj;
		if(name.equals(s.name) && id==s.id) {
			return true;
		}else {
			return false;
		}
		}
		return false;
		}
	public static void main(String[] args) {
		student3 s1=new student3(01, "mahesh");
		student3 s2=new student3(02, "siva");// true...CONTENT COMPARSION
		student3 s3=new student3(01, "mahesh");// true
		student3 s4=s1;
		student3 s5=new student3(02, "siva");// true...CONTENT COMPARSION
		student3 s6=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));// true...CONTENT COMPARSIO
		System.out.println(s1.equals(s4));//true
		System.out.println(s2.equals(s5));// true...CONTENT COMPARSIO
		System.out.println(s2.equals(s6));//true
	//	in that OVERRIDE EQUALS method is working
		//  override ".EQUALS" is only " CONTENT COMPARSION" only
	}
}
