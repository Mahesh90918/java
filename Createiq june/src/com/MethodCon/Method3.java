package com.MethodCon;

public class Method3 {
	private int age;// private means secure and not allowing other class
	private String name;
	private int weight;
	static String PERSON_DETAILS = "general questions ";

	public Method3(int age, int weightt, String name) {
		this.age = age;
		weight = weightt;
		this.name = name;
	}

	public Method3(int i, String name) {
		// TODO Auto-generated constructor stub
		age = i;
		this.name = name;

	}

	public Method3() {
		// TODO Auto-generated constructor stub
		System.out.println("defult constructor");
	}

	void printmethod() {
		System.out.println("parametarized constructor");
		System.out.println("age  " + age);
		System.out.println("name " + name);
		System.out.println("weight " + weight);
		System.out.println(PERSON_DETAILS);
	}

	// write only setters
	// when private keyword use in the local varible on that time other class not
	// allowing in this class then use setter and getter other class calling
	public int setAge(int age) {
		return this.age = age;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public int setWeight(int weight) {
		return this.weight = weight;
	}

//read only getters
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;

	}

	public int getWeight() {
		return weight;
	}

	public static void main(String[] args) {
		Method3 s1 = new Method3(10, 17, "siva");
		s1.printmethod();

		Method3 s2 = new Method3(12, "subbu");
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
	}
}
