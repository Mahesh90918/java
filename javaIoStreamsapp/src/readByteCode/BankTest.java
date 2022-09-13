package readByteCode;

import internMethod.bank;

public class BankTest {
	public static void main(String[] args) {
		bank b = new bank(10000);
		Runnable deposit = new Runnable() {

			@Override
			public void run() {
				try {
					b.deposit(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(deposit);

		Runnable withdrew = new Runnable() {

			@Override
			public void run() {
				try {
					b.Withdraw(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(withdrew);
		t1.start();
		t2.start();
	}
}