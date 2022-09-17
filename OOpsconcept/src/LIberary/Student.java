package LIberary;

public class Student{
	String name;
	int id;
	int fee;
	public Student(String name,int id,int fee)
	{
		this.name=name;
		this.id=id;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(fee);
	}
	public static void main(String[] args)
	{
		Student st=new Student("mahesh",1,7889);
		
		st.display();
	}

	

}
