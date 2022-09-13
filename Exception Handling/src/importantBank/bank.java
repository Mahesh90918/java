package importantBank;

public class bank {
	int id;
	String name;
	double amount;
	double deposit;
	double withdrawal;

	protected bank(int id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double amount) {
		this.amount = amount;
	}

	public double getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
	}

// deposit
	public void Deposite(double deposit) {
		if (deposit > 100) {
			System.out.println("......PRINT AMOUNT........ ");
			this.setAmount(this.getAmount() + deposit);// this means this class
			System.out.println("ADDING AMOUNT   :  " + deposit);
			System.out.println("TOTAL AMOUNT    :  " + this.getAmount());
		} else {
			System.out.println("miminum amount above 101");
		}
	}

// withdrawal
	public void withdraw(double withdraw) {
		System.out.println("......PRINT WITHDRAWAL AMOUNT........ ");
		if (this.getAmount() >= withdraw) {
			this.setAmount(this.getAmount() - withdraw);
			System.out.println("WITHDRAW AMOUNT :" + withdraw);
			System.out.println("REMAINING AMOUNT:" + this.getAmount());
		} else if (this.getAmount() < withdraw) {
			System.out.println("insufficient funds");
		}
	}
	// Transfer amount
	public void transfor(Object obj ,double trans) {
		bank e=(bank) obj;// important
		if(this.amount<=trans) {
			System.out.println("insufficient funds");
			try {
			throw new IllegalAccessException("insufficient funds");
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}else {
			this.amount-=trans;
			e.amount +=trans;
		}
	}

	@Override
	public String toString() {
		return "bank [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
