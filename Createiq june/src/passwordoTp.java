import java.util.Random;

public class passwordoTp {
	 public static void main(String[] args) {

	      System.out.println(generateOTP(4));
	   }

	   private static char[] generateOTP(int length) {
	      String numbers = "6301390918";
	      Random random = new Random();
	      char[] otp = new char[length];

	      for(int i = 0; i< length ; i++) {
	         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
	      }
	      return otp;
	   }
}
