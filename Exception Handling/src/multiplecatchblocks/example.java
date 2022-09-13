package multiplecatchblocks;

import java.io.IOException;

public class example {
	public static void main(String[] args) {
// multiple catch block
		// we can write catch block only child to parent
		try {
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
