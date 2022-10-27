package com.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}
}
