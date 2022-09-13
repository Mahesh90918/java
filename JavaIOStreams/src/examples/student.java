package examples;

public class student {
	int id;
	String name;
	double fee;

	public student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

	
}
