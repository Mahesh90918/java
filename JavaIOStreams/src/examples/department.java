package examples;

import com.sun.tools.javadoc.Main;

public class department {
	String Ece;
	String Cse;
	String EEE;
	String Mech;
	public department(String ece, String cse, String eEE, String mech) {
		super();
		Ece = ece;
		Cse = cse;
		EEE = eEE;
		Mech = mech;
	}
	@Override
	public String toString() {
		return "department [Ece=" + Ece + ", Cse=" + Cse + ", EEE=" + EEE + ", Mech=" + Mech + "]";
	}
	
}
