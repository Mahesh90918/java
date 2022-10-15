
public class convertyeartomonth {
	public static void main(String[] args) {
		int days = 450;
		int year = days / 365;

		int weeks =(days - (year*365)) / 7;
		System.out.println("years  :" + year);
		System.out.println("weeks  :" + weeks);

	}

}
