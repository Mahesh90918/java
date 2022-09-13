package nullpointerexceptionn;

public class example2 {

public static void main(String[] args) {
	
	example2 e1=null;
	example2 e3=null;
	
	System.out.println(e1==null);//true
	//System.out.println(e1.equals(e3));// runtime  exception  nullpointer
	//System.out.println(null.equals(null));//compiler time error
	example2 e2=new example2();
	// if any reference equals to the null its always false
	System.out.println(e2==null);// false
	System.out.println(e2.equals(null));// false
	
	String s=null;
	System.out.println(s);
	System.out.println((String)null);// valid
	//char [] ch=null;
	//System.out.println(ch);// not valid
	//System.out.println((char[])ch);// not valid

}
}
