package arrayImp;

public class Stringduplicate {
	public static void main(String[] args) {
		String s = "java is a java programe";
		char firstRepatedchar = ' ';
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp != ' ') {
				if (s.indexOf(temp) != s.lastIndexOf(temp)) {

					if (firstRepatedchar == ' ') {
						firstRepatedchar = temp;
					}
				}
			}
		}
		System.out.println("input :" + s);
		System.out.println("firstRepatedchar :" + firstRepatedchar);
		

	}
}
