package clone;

public class example2 implements Cloneable {
	//SHALLOW CLONING IS USED ONLY PRIMITIVE DATA
	int id;
	String name;
	String clg;

	protected example2(int id, String name, String clg) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "example2 [id=" + id + ", name=" + name + ", clg=" + clg + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
//		try {
		example2 e1 = new example2(01, "mahesh", "stn");
		// object returning the class casting is used
		example2 e2 = (example2) e1.clone();
		e2.name = "siva";
		System.out.println("ariginal data  :"+e1.toString());
		System.out.println("cloned data    :"+e2.toString());
		System.out.println(" SHALLOW CLONING IS USED ONLY PRIMITIVE DATA");

		// when that time copy from data on that time errors may be occur then use
		// try and catch blocks

//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}