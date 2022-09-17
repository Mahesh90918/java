package clone;

public class example3 implements Cloneable {
	//SHALLOW CLONING IS USED ONLY PRIMITIVE DATA
	int id;
	String name;
	double fee;

	protected example3 (int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "example3 [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	} 

	public static void main(String[] args) throws CloneNotSupportedException {
		example3 s1 = new example3(01, "mahesh", 2500);
		example3 s2 = new example3(02, "shankar", 2500);
		example3 s3=(example3) s1.clone();
		example3 s4=(example3) s2.clone();
		s3.name="siva";
		s4.fee=50000;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3);
		System.out.println(s4.toString());
	}
}
