package Bankfulldetails;

import com.interfaceabstract.Savingsss;

public class Testaccount1 {

	public static void main(String[] args) {

		Savingsss save = new Savingsss("Sbi00998", "mahesh", 30000);
		save.Deposite(100000);
		save.display();
		save.Deposite(10000);
		save.display();
	}
}
