package com.taxes;

public class tax {
public static void main(String[] args) {
	int sal=51000;
	if(sal<=10000) {
		System.out.println("  ...NO TAX.....");
	}else if(sal>10001 && sal<=50000){
		double Tax=sal*0.10;
		System.out.println(" TAX :"+Tax);
	}else {
		double Tax=sal*0.30;
		System.out.println("TAX  :"+Tax);
	}
	
}
}
