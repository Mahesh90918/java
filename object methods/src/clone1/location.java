package clone1;
//cloneable interfaces
public class location implements Cloneable {
 private long pincode;
 private String state;
protected location(long pincode, String state) {
	super();
	this.pincode = pincode;
	this.state = state;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
// clone method
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
@Override
public String toString() {
	return "location [pincode=" + pincode + ", state=" + state + "]";
}
 
}
