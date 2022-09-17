package com.interfaceimple;

public class testBank {
	public static void main(String[] args) {
		Bank b=new SBI();
		b.interestrates();
		SBI s=new SBI();
		b.interestrates();
		ANDHRA a=new ANDHRA();
		//a.interestrates();
		UNION u=new UNION();
		u.interestrate1();
		
		b.interestrates();
		System.out.println(b.bank);
		System.out.println(b.BANKNAME);
	}

}
