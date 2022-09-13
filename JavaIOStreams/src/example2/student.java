package example2;

public class student {
	int id;
	String name;
	double fee;
	address addr;
	gender enm;
	public student(int id, String name, double fee, address addr, gender enm) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.addr = addr;
		this.enm = enm;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fee=" + fee + ", addr=" + addr + ", enm=" + enm + "]";
	}
	
}
