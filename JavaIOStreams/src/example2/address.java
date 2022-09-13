package example2;

public class address {
	String location;
	long pincode;
	String state;
	public address(String location, long pincode, String state) {
		super();
		this.location = location;
		this.pincode = pincode;
		this.state = state;
	}
	@Override
	public String toString() {
		return "address [location=" + location + ", pincode=" + pincode + ", state=" + state + "]";
	}
	
}
