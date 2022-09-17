package Bankfulldetails;

public class AccountTEST {
	public static void main(String[] args) {
//		Savings sav = new Savings("sbi27334", "mahesh", 20000);
//		sav.Deposite(0);
//		System.out.println(sav);
//		sav.withdraw(0);
//		System.out.println(sav);

		Taxes tax = new Taxes("sbi52475", "mahesh", 10000);
		tax.Deposite(15000);
		System.out.println(tax);
	}
}
