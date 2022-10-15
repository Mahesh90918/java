public class OperatorExample{  
public static void main(String args[])
{  
	
int a=10;  
int b=10;  
//System.out.println(a++ +--a);//10+10
//System.out.println(a-- + a++);// 9+10
//System.out.println(--a + ++a);//9+10
//System.out.println(--a +--a);//9+8
//System.out.println(++a + --a +  a++ + a--);//11+10+11+10
System.out.println(a++ - --a);//10-9-
System.out.println(a++ + ++a);//10+12=22

System.out.println(b++ + b++);//10+11=21  

  
}
}  

