
public class altshiftso {

	int a;
	double b;
	String subject;
	String name;
	
	
	//parameter constructor is created shortcut (alt+shift+s+o)
	protected altshiftso(int a, double b, String subject, String name) {
		super();
		this.a = a;
		this.b = b;
		this.subject = subject;
		this.name = name;
	}
	//constructor shortcut (ctrl+space)
	public void altshiftso() {
		System.out.println((a)+" "+(b)+subject+name);
	}public static void main(String[] args) {
		
	
	altshiftso f=new altshiftso(1, 32.0, "maths", "mahesh");
	f.altshiftso();
}}
