package com.javaprogram;

import java.io.IOException;

class Rupomroy123{  
	 void method(int age) throws IOException  {  
		 if(age<18)
	  throw new IOException("device error");  
		 else
			 System.out.println("welcome to vote");
	 }  
	}  



public class Examplesseven {

	/*public static void main(String[] args)    {
		// TODO Auto-generated method stub
		try
		{
		   Rupomroy123 r1=new Rupomroy123();
		         r1.method(25);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		

	}*/
	
	//Another way
	public static void main(String[] args) throws IOException     {
		// TODO Auto-generated method stub
		
		   Rupomroy123 r1=new Rupomroy123();
		         r1.method(12);
		}
		
}
