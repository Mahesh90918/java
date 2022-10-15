package com.MethodCon;

public class Method4 {
	public static void main(String[] args) {
		// outside the class calling an object
		//object calling process
		Method3 s3 = new Method3(334, "fhhjgj");// object
		System.out.println(s3.getAge());
		System.out.println(s3.getName());
		System.out.println("....................");
		Method3 s4 = new Method3(20, 50, "sujji");// we can access instance  (private keyword)
		System.out.println(s4.getAge() +" "+s4.getName()+" "+s4.getWeight());//(second type)
		s4.printmethod();// two types of calling(one)
		System.out.println("...............");
		Method3 s5 = new Method3();// object
		//when you use private key word these members not allowing the out side the class
//      s5.age = 17;
//		s5.name = "subbu";
//		s5.weight = 50;
//		System.out.println(s5.age);
//		System.out.println(s5.name);v
//		System.out.println(s5.weight);
		// when private keyword use follow this condition
		// setter is writing
		s5.setAge(26);
		s5.setName("paddu");
		s5.setWeight(56);
		//getter is reading only
		System.out.println(s5.getAge());
		System.out.println(s5.getName());
		System.out.println(s5.getWeight());

	}
}