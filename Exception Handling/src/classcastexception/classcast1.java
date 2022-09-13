package classcastexception;

public class classcast1 {
public static void main(String[] args) {
	Object obj=new String("mahesh");// valid
	String s=(String) obj;//valid
	System.out.println(s);
	//exception classcast
	Object obj1 = new Object();
	String s1 = (String) obj1;// in valid
	System.out.println(s1);
}
}
