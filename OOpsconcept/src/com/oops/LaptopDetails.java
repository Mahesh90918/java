package com.oops;

public class LaptopDetails {

	String brandName;
	String model;
	String ram;
	int ssd;
	String processor;

	public void printlaptopdata() {
		System.out.println("brandName " + brandName);
		System.out.println("model " + model);
		System.out.println("ram " + ram);
		System.out.println("ssd " + ssd);
		System.out.println("processor " + processor);
		System.out.println("................");
	}

	public static void main(String[] args) {
		LaptopDetails dell = new LaptopDetails();

		dell.brandName = "dell";
		dell.model = "latitude";
		dell.ram = "8gb";
		dell.ssd = 256;
		dell.processor = "i7";
		dell.printlaptopdata();

		LaptopDetails hp = new LaptopDetails();
		hp.model = "ggfg";
		hp.brandName = "hvjjgp";
		hp.processor = "i7";
		hp.ram = "09";
		hp.ssd = 669;
		hp.processor = "fyff";
		hp.printlaptopdata();

	}

}
