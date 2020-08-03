package com.javaprogram;


public class ConstructorThisExample {
	
	public ConstructorThisExample()
	{
		System.out.println("rupom");
	}
	
	public ConstructorThisExample(int j)
	{
		this();
		System.out.println("soma");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorThisExample c1=new ConstructorThisExample(10);
	}

}
