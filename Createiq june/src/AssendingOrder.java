
public class AssendingOrder {
	public static void main(String[] args) {
		
		int a[]= {5,72,2,77,44,99,55,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			}
			}
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
		}
		
		
	}

	}