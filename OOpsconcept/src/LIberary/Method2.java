package LIberary;
 class Method2{
	public void chemistry() {
		System.out.println(" ");
		String che[] = { "chemistry1", "chemistry2", "chemistry3", "chemistry4" };
		System.out.println("chemistry book available");
		for (int i = 0; i < che.length; i++) {
		
			System.out.println(che[i]);
		}	
		}public void physics() {
			System.out.println(" "); 
			String phy[]= {"physicsa","physics2","physics3","physics4"};
			System.out.println("physics book available");
			for(int j=0;j<phy.length;j++) {
				System.out.println(phy[j]);
			}
			}public void biology() {
				System.out.println(" ");
				String[] bio= {"biology1","biology2","biology3","biology4"};
				System.out.println("biology books available");
				for(int k=0;k<bio.length;k++) {
					System.out.println(bio[k]);
				}
	}

}
