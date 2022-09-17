package com.inheritanceconcept;

public class passport {
	final String COUNTRY = "india";
	int passportid;

	public passport(int passportid) {
		this.passportid = passportid;
	}

	public passport() {

	}

	void passport() {
		if (passportid == 0)

		{
			System.out.println("......wrong passport id......");
		} else {
			System.out.println(" passportid :" +"  "+ passportid +" "+ "country    :" + COUNTRY);
		}
	}
}
