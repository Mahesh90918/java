package clone2;

public class Address implements Cloneable {
	private String locations;
	private String companyname;

	protected Address(String locations, String companyname) {
		super();
		this.locations = locations;
		this.companyname = companyname;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	@Override
	public String toString() {
		return "Address [locations=" + locations + ", companyname=" + companyname + "]";
	}

}