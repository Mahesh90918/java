
public class exam1  extends Thread{
@Override
public void run() {
	System.out.println("hello");
}public static void main(String[] args) {
	exam1 r=new exam1();
	r.start();
	r.stop();
	r.start();
}
}
