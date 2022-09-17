package com.interfaces1;

public class person extends student {
	protected person(int a, String name, long fee) {
		super(a, name, fee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("student1");
	}

	@Override
	public void empolyee1() {
		// TODO Auto-generated method stub
		System.out.println("empolyee1");
	}
	public void mahesh111() {
		System.out.println(super.mahesh());
	
	}@Override
	public String mahesh() {
		student(); 
		return super.mahesh();
		
	}

	@Override
	public void person() {
		// TODO Auto-generated method stub
		
	}
	
}
