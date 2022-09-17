package clone2;

public class empolyee implements Cloneable {
  int id;
  String name;
  Address address;
protected empolyee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		empolyee Emp= (empolyee) super.clone();
		Emp.setAddress((Address) Emp.getAddress().clone());
		return Emp;
	}
@Override
public String toString() {
	return "empolyee [address=" + address + ", id=" + id + ", name=" + name + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}public static void main(String[] args) {
	Address address1=new Address("hyd", "abcd");
	empolyee e=new empolyee(01, "mahesh", address1);
	System.out.println(e);
	empolyee e1=new empolyee(01, "mahesh", address1);
	try {
		empolyee e2=(empolyee) e1.clone();
		e2.name="siva";
		e2.getAddress().setCompanyname("wipro");
		System.out.println("original data"+e1);
		System.out.println("cloned data"+e2);
	} catch (CloneNotSupportedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
}
 

}
