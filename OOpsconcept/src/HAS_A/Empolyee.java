package HAS_A;

public class Empolyee {
	int id;
	String name;
	String company;
	Address address;

	protected Empolyee(int id, String name, String company, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.address = address;
	}

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Address getAddress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "Empolyee [id=" + id + ", name=" + name + ", company=" + company + ", address=" + address + "]";

	}

}
