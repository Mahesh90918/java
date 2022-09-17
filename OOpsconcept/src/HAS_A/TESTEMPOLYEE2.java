package HAS_A;

public class TESTEMPOLYEE2 {
	public void getbydist(String dist) {
		Address Address1 = new Address("lakkupuram", "Burja", "sklm", 532445);
		Address Address2 = new Address("allena", "Burja", "sklm", 532406);
		Address Address3 = new Address("palavalasa", "Burja", "pklm", 532400);
		Address Address4 = new Address("tuddali", "Burja", "sklm", 532405);
		Empolyee empolyee1 = new Empolyee(01, "mahesh", "ABC ", Address1);
		Empolyee empolyee2 = new Empolyee(02, "siva", "ABC", Address2);
		Empolyee empolyee3 = new Empolyee(03, "sriman", "ABC ", Address3);
		Empolyee empolyee4 = new Empolyee(04, "shan", "ABC ", Address4);
		Empolyee empolyee5 = new Empolyee(05, "ravi", "ABC ", Address4);
		Address ad[] = { Address1, Address2, Address3, Address4 };
		Empolyee[] emp = { empolyee1, empolyee2, empolyee3, empolyee4, empolyee5 };
		int result=0;
		for (Empolyee e : emp) {
			for (Address a : ad) {
				if (a.getDist() == dist && e.getAddress()==a) {
					System.out.println(e);		
					result=1;
				}

			}
		}if(result==0) {
			System.out.println("wrong details");
		}
	}

	public static void main(String[] args) {
		TESTEMPOLYEE2 s = new TESTEMPOLYEE2();
		s.getbydist("pklm");
	
	
	}
}