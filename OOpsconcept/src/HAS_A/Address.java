package HAS_A;

public class Address {
String vill;
String mandel;
String dist;
long pincode;

protected Address(String vill, String mandel, String dist, long pincode) {
	this.vill = vill;
	this.mandel = mandel;
	this.dist = dist;
	this.pincode = pincode;
}

public String getVill() {
	return vill;
}

public void setVill(String vill) {
	this.vill = vill;
}

public String getMandel() {
	return mandel;
}

public void setMandel(String mandel) {
	this.mandel = mandel;
}

public String getDist() {
	return dist;
}

public void setDist(String dist) {
	this.dist = dist;
}

public long getPincode() {
	return pincode;
}

public void setPincode(long pincode) {
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Address [vill=" + vill + ", mandel=" + mandel + ", dist=" + dist + ", pincode=" + pincode + "]";
}

}
