package classcastexception;

class example1 {
	int id;
	String name;
	
	public void sound() {
		System.out.println("example1  sound");
	}

	public example1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "example1 [id=" + id + ", name=" + name + "]";
	}

}




