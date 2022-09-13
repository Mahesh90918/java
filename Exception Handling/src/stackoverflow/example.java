package stackoverflow;

public class example {
	// raises automatically by the JVM wherever
// we are performing recursive methods invocation
	
	public void sound() {
		djsound();
	}

	public void djsound() {
		sound();
	}

	public static void main(String[] args) {
		example e = new example();
		e.djsound();
	}
}
