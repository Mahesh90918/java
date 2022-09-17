package clone1;

public class students implements Cloneable {
	private int id;
	private String name;
	// has -a relation
	// deep cloning is used to object reference type
	private Address address;// object REFERENCE calling type
	private location pincode;
	protected students(int id, String name, Address address, location pincode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
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

	public Address getaddress() {
		return address;
	}

	public void setaddress(Address address) {
		this.address = address;
	}

	public location getPincode() {
		return pincode;
	}

	public void setPincode(location pincode) {
		this.pincode = pincode;
	}
	
	
// PROGRAMMER RESPONSIBLE OR CLONING
	
// clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// super.clone is used from object class clone method
		students clones = (students) super.clone(); 
		// this line is used Address(object) changes
		clones.setaddress((Address) clones.getaddress().clone());
		// this line is used location(object) changes
		clones.setPincode((location) clones.getPincode().clone());
		return clones;
	}

	@Override
	public String toString() {
		return "students [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}

// 2.deep cloning 
//	deep is used both primitives and object types (aggregation)

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address1 = new Address("mankustreet", "school");
		Address address2 = new Address("mudilastreet", "temple");
		location pincode1 = new location(532445, "ANDHRA");
		location pincode2 = new location(532440, "ANDHRA");
		students s = new students(01, "mahesh", address1, pincode1);
		System.out.println(s.toString());
		students s1 = new students(01, "mahesh", address1, pincode1);
		System.out.println(" original data" + s1);
		// use the clone method
		students clones = (students) s1.clone();
		// change the cloned data
		clones.getaddress().setNearby("college road");
		clones.getaddress().setStreet("main street");
		System.out.println(" cloned conveted data" + clones);
		System.out.println("............CLONED DATA 2..........");
		students s3 = new students(02, "siva", address2, pincode2);
		students s4 = (students) s3.clone();
		// change name
		s4.name = "shankar";
		// change ADDERS
		s4.getaddress().setNearby("SIVA TEMPLE");
		// changes the location
		s4.getPincode().setState("TELANGANA");
		System.out.println("orginal data :" + s3);
		System.out.println("cloned data :" + s4);

	}
}
