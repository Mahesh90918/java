package com.Encapsulationss;

public class Encapsulation {
	private final String BANK = "SBI BANK";
	private static String BRANCH = "PALAKONDA";
	private String Accountnumber;
	private String AccountHolder;
	private double AccountBalance;
	static void change() {
		BRANCH = "VISHAKA";
	}

	protected Encapsulation(String Accountnumber, String accountHolder, double accountBalance) {
	
		if (Accountnumber.length() == 6) {
// if account number is equals to six otherwise its going through invalid	
		this.Accountnumber = Accountnumber;
			AccountHolder = accountHolder;
			AccountBalance = accountBalance;

			System.out.println("....VALIED ACCOUNT NUMBER.... ");
		} else {
			System.out.println("--ACCOUNTNUMBER MINIUM 6 DIGITS----");
			System.out.println("---INVALID ACCOUNT NUMBER---");
		}

	}

	public void diplaydata() {
		change();
		System.out.println("..........ACCOUNT DETAILS......");
		System.out.println("BRANCH          :" + BRANCH);
		System.out.println("BANK            :" + BANK);
		System.out.println("ACCOUNTNUMBER   :" + Accountnumber);
		System.out.println("ACCOUNTHOLDER   :" + AccountHolder);
		System.out.println("ACCOUNTBALANCE  :" + AccountBalance);
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	public String getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		Accountnumber = accountnumber;
	}

}
