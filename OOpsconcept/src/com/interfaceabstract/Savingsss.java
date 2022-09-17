package com.interfaceabstract;

public class Savingsss extends Accountsss implements Taxes {

	public Savingsss(String accountno, String name, double amount) {
		super(accountno, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Deposite(double deposit) {
		if (deposit > 100) {
			System.out.println("......PRINT AMOUNT........ ");
			super.setAmount(super.getAmount() + deposit);
			System.out.println("ADDING AMOUNT   :  " + deposit);
			System.out.println("TOTAL AMOUNT    :  " + super.getAmount());
		} else {
			System.out.println("miminum amount above 101");
		}
	}

	@Override
	public void withdraw(double withdraw) {
		// TODO Auto-generated method stub
		if (super.getAmount() >= withdraw) {
			super.setAmount(super.getAmount() - withdraw);
			System.out.println("WITHDRAW AMOUNT :" + withdraw);
			System.out.println("REMAINING AMOUNT:" + super.getAmount());
		} else if (super.getAmount() < withdraw) {
			System.out.println("insufficient funds");
		}
	}

	@Override
	public void display() {
		// Savingsss.SBI();
		super.display();
		Taxamount();
	}

	@Override

		public void Taxamount() {
		
		double amount;
if(super.getAmount()<100000) {
	System.out.println("  ...NO TAX.....");
		        super.display();
	}else if(super.getAmount()>=100000 && super.getAmount()<=200000){
		double Tax=super.getAmount()*0.10;
			 amount=super.setAmount(super.getAmount()-Tax);
			System.out.println(" TAXES :"+Tax);
			System.out.println("amount :"+amount);
		            super.display();
		}else {
			double Tax=getAmount()*30;
			 amount=super.setAmount(super.getAmount()-Tax);
			System.out.println("TAX  :"+Tax);
			System.out.println("amount :"+amount);
		       super.display();
		}
//		
//	}
///1 laks above each and every time amount cut
//	@Override
//	public void amount(double amount) {
//		amount =100000;
//		// TODO Auto-generated method stub
//		if(getAmount()>=amount) {
//			System.out.println("Before tax your Acoount balance :"+amount);
//			amount =super.getAmount();
//			double Tax=super.getAmount()*tax;
//			super.setAmount(super.getAmount()-Tax);
//			System.out.println("after TAX  :"+Tax);
//			double total=amount-Tax;
//			System.out.println("total Amount :"+super.getAmount());
//			
//		}
//		
	}
}
