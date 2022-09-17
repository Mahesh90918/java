package hascode1;

public class hascode {
public static void main(String[] args) {
	String s1="mahesh";
	String s2="mahesh";
	String s3="unukuru";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s1==s2);//true
	System.out.println(s2==s3);//false
	String s4=new String("mahesh");
	String s5=new String("mahesh");
	String s6=new String("unukuru");
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	System.out.println(s6.hashCode());
	System.out.println(s4==s5);//false
	System.out.println(s5==s6);//false
	//s1==s2==s4==s6== hascode is equal
	//s3==s6==hascode
	System.out.println(s1.hashCode()==s2.hashCode());// true
	System.out.println(s4.hashCode()==s5.hashCode());// true
	System.out.println(s1.hashCode()==s4.hashCode());// true
	System.out.println(s2.hashCode()==s5.hashCode());// true
	System.out.println(s3.hashCode()==s6.hashCode());// true
	
	
}
}
