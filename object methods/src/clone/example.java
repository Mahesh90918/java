package clone;

public class example {
	// the object clone is the way to create "EXISTS COPY OF AN OBJECT"
	// NOT A REFERENCE TYPE OBJECT
	
	//creating the new object from an already present object
	//COPY THE ALL DATA FROM THE PRESENT OBJECT TO NEW OBJECT
	
	
	
	// to achieve the clone with help of CLONABLE interface
	int id;
	String name;
	protected example(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}
	@Override
	public String toString() {
		return "example [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		// two types of cloning
		//1.shallow cloning
//		shallow is used with in the class primitives only
		example e1=new example(01, "mahesh");
		example e2=e1;
	  System.out.println(	e1.toString());
	  System.out.println(	e2.toString());
	  
	  //1.shallow cloning
	  example e3=new example(02, "mahesh");
		example e4=e3;
		// e3,e4 these two names are changed this is disadvantages of shallow cloning
		e4.name="mahi";
	  System.out.println(	e3.toString());
	  System.out.println(	e4.toString());
	  
	  
	  //2. shallow cloning
//		deep is used both primitives and object types 
	  example e5=new example(05, "mahesh");
	  // this only two variables that why calling like that
	  // then number of variable the go with clonable interfaces
	  example e6=new example(e5.id, e5.name);
	  // change only one value of an object
	  e6.name="mahi";
	  System.out.println(	e5.toString());
	  System.out.println(	e6.toString());
		
		
	}
}
