package classcastexception;

public class example21 extends example1 {
	int fee;

	public example21(int id, String name, int fee) {
		super(id, name);
		this.fee = fee;
	}

	public String toString() {
		return "example2 [fee=" + fee + "]";
		
	}

}
