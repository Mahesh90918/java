
public class Evoked {
	
	void m(Evoked object) {
		System.out.println("method evoked");
	}void a(){
		m(this);
	}public static void main(String[] args) {
		Evoked s1=new Evoked();
		s1.a();
	}

}
