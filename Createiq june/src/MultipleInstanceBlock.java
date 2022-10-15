
public class MultipleInstanceBlock {
	{
		System.out.println("Instance Block 1 logic");
	}

	MultipleInstanceBlock() {
		System.out.println("Instance Block 2 logic");
	}

	MultipleInstanceBlock(int a) {
		System.out.println("Instance Block 3 logic");
	}

	public static void main(String[] args) {
		new MultipleInstanceBlock();
		new MultipleInstanceBlock();
		new MultipleInstanceBlock(10);
	}
}
