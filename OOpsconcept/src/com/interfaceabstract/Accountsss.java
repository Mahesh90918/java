package com.interfaceabstract;

public abstract class Accountsss implements Taxes {
	private String accountno;
	private String name;
	private double amount;
	static  String BANKDETAILS="BANK";
	static void SBI() {
		BANKDETAILS="SBI BANK";
	}static void UNION() {
		BANKDETAILS="SBI BANK";
	}
	public Accountsss(String accountno, String name, double amount) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.amount = amount;
	}

	public abstract void Deposite(double deposit);

	public abstract void withdraw(double withdraw);

	
	public void display() {
		
		System.out.println( "Acccounts [accountno=" + accountno + ", name=" + name + ", amount=" + amount + ",BANKDETAILS="+BANKDETAILS+"]");
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public double setAmount(double amount) {
		return this.amount = amount;
	}

}
