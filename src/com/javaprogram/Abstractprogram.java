package com.javaprogram;

abstract class rupom
{
	public void roy()
	{
		System.out.println("java learning");
	}
	
	public void victor()
	{
		System.out.println("big data experienced");
	}
	
	public abstract void soma();
}



public class Abstractprogram extends rupom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractprogram r=new Abstractprogram();
		r.victor();
		r.roy();
		r.soma();

	}

	@Override
	public void soma() {
		// TODO Auto-generated method stub
		System.out.println("sales force developer");
		
	}

}
