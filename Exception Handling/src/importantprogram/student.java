package importantprogram;

public class student {
	private int id;
	private String name;
	private double fee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	protected student(int id, String name, double fee) {
//		if (id == 0) {
//			System.out.println(" id are INVALID details");
//		}
//		if (name == null) {
//			System.out.println(" name are INVALID details");
//		}
//		if (fee == 0.0) {
//			System.out.println(" fee are INVALID details");
//		}
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

}
