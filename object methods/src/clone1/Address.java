package clone1;
// cloneable interfaces
public class Address implements Cloneable{
 private String street;
 private String nearby;
protected Address(String street, String nearby) {
	super();
	this.street = street;
	this.nearby = nearby;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getNearby() {
	return nearby;
}
public void setNearby(String nearby) {
	this.nearby = nearby;
}
// clone method
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
@Override
public String toString() {
	return "Address [street=" + street + ", nearby=" + nearby + "]";
}
 
}
