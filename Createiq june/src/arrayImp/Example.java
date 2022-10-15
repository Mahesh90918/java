package arrayImp;

public class Example {
	public static void main(String[] args) {
		
		String str="beautiful beach";
		char[]arr=str.toCharArray();
		System.out.println("the  string is:"+str);
		System.out.println("duplicate characters in above string are:");

	for (int i = 0; i < str.length(); i++) {
		for (int j = i+1; j < str.length(); j++) {
			
			if (arr[i]==arr[j]) {
				System.out.println(arr[j]+"");
				break;
			}
			
			
		}
		
	}
	}

}
