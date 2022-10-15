
public class FIndlargeNum {
	public static void main(String[] args) {
		
	int result=0;
	int a [] = {100,33,200,9,97,1,300};
	
	int large=a[0];
	for(int i=0;i<a.length;i++) {
		
		if(large<a[i])
				 {
			result=a[i];
			
		}
		
		
	}
	System.out.println(result);
	

}}
