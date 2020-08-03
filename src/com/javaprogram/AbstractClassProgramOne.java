package com.javaprogram;

abstract class Base { 
   public Base() 
    { 
    	System.out.println("Base Constructor Called"); } 
      abstract void fun(); 
} 




public class AbstractClassProgramOne extends Base {
	public AbstractClassProgramOne() { 
		System.out.println("Derived Constructor Called"); 
		} 
	public void fun()
	{
		System.out.println("Derived fun() called"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base b=new Base(); we cannot create object for abstract class
		
		AbstractClassProgramOne a=new AbstractClassProgramOne();
		//a.fun();
		
		

	}

	

}
