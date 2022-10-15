package com.MethodCon;

public class Laptop {
	int model;
	String brand;
	String processor;
	static String LAPTOP=".....DELL....";
public  Laptop(int model,String brand,String processor) {
		this.model = model;
		this.brand = brand;
		this.processor=processor;
}
public int SetModel(int model){
	return	this.model=model;
	
}public String setBrand(String Brand) {
	return this.brand=brand;
}public String setProcessor(String processor) {
	return this.processor=processor;
}
public int getModel() {
	return model;
}public String getBrand() {
	return brand;
	
}public String getProcessor() {
	return processor;
	
}
public static void main(String[] args) {
	Laptop A=new Laptop(2019,"dell","i7");
	//model 1
	System.out.println(A.brand+"   "+A.model+"  "+A.processor);
	System.out.println(LAPTOP);
	//model 2
	System.out.println(A.brand+"\n"+A.model+"\n "+A.processor);
    //model 3
	System.out.println(LAPTOP);
	System.out.println(A.brand);
	System.out.println(A.model);
	System.out.println(A.processor);
	//use any one model no problem
}
}