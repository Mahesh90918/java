package Bankfulldetails;

public class Savings extends Accounts {
// Bank
	public Savings(String accountno, String name, double amount) {
		super(accountno, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Deposite(double amount) {//amount = withdraw
		if (amount <= 0) {
			System.out.println("....please add certain amount....");

		} else {
			super.setAmount(super.getAmount() + amount);
			System.out.println(amount);
		}
	}

	@Override
	public void withdraw(double amount) {
		 if (amount <= 0) {
		System.out.println("...please add certain amount......");
		 }
		 else if (super.getAmount() < amount) {// amount=withdraw
			System.out.println("please maintain minium balance");
		} else if (super.getAmount() > amount) {
			super.setAmount(super.getAmount() - amount);
			System.out.println(amount);

		}
	}

//	public void withdraw1(double amount) {
//		if (amount <= 0) {
//			System.out.println("... insufficient funds.......");
//		} else if (super.getAmount() > amount) {
//			System.out.println(" please maintain minimum balance..");
//		}else if (super.getAmount() < amount) {
//		super.setAmount(super.getAmount() - amount);
//		System.out.println(amount);
//		}
//	}

}
