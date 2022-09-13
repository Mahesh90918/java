package importantBank;

public class testBank {
	public static void main(String[] args) {
		bank b = new bank(01, "mahesh", 10001);
		System.out.println(b);
		b.Deposite(12000);
		System.out.println(b);
		b.withdraw(4545);
		System.out.println(b);
		bank b2 = new bank(02, "mahesh", 10001);
		bank b3 = new bank(03, "mahesh", 5000);
		b2.transfor(b3, 1000);
		System.out.println(b3);
		System.out.println(b2);
	
	}
}
