package com.javaprogram;

class D
{
	public void run()
	{
		System.out.println("in run");
	}
}

class E extends D
{
	public void wish()
	{
		System.out.println("in wish");
	}
}

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		D a1=new E();
		a1.run();
		//downcasting
		E e1=(E)a1;
		e1.run();
		e1.wish();

}

}