package com.sarada;

public class RemoveSplCharacter {
	public static void main(String[] args) {
		String s = "csdfhf21634!@#$%";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}

		}if(count==0) {
			System.out.println("This is NO special Character ");
		}else {
			System.out.println("This is  special Character "+count);
		}
	}
}
