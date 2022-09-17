package Bankfulldetails;

public  class Taxes extends Savings {
private static  double DEPOSITAXES=0.3;
private double WITHDRATAXES=0.10;
	public Taxes(String accountno, String name, double amount) {
		super(accountno, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Deposite(double amount) {
		if(super.getAmount()<10000) {
		super.Deposite(super.getAmount());
		}else {
			System.out.println("no taxess aply");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(super.getAmount()>=5001) {
			//amount= super.getAmount()-WITHDRATAXES;
			super.setAmount(super.getAmount()-WITHDRATAXES-amount);
			System.out.println(amount);
		}else {//if(5000<super.getAmount()){
			System.out.println("..no taxes....");
		}
		
	}

	

}
