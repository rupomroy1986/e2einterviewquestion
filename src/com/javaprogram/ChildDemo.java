package com.javaprogram;

public class ChildDemo extends ParentDemo {
	String name="roy";
	public void getData() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void getValue()
	{
	super.getValue();
		System.out.println(" I am in the child method");
	}

	public ChildDemo() {
		super();
		System.out.println("I am in child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo cd=new ChildDemo();
		cd.getData();
		cd.getValue();
		
		
		

	}

}
