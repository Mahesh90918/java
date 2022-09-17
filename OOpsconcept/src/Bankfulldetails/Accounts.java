package Bankfulldetails;

public abstract class Accounts {
	private String accountno;
	private String name;
	private double amount;
	public Accounts(String accountno, String name, double amount) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.amount = amount;
	}
	
	public abstract void Deposite(double amount);
	public abstract void withdraw(double amount);
	
	
	@Override
	public String toString() {
		return "Acccounts [accountno=" + accountno + ", name=" + name + ", amount=" + amount + "]";
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
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
