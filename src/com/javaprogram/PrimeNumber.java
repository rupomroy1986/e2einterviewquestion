package com.javaprogram;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value=58;
		boolean temp=false;
		for( int i=2;i<=value/2;i++)
		{
			//1st approach
			/*if(value%i==0)
			{
				temp=true;
				break;
			}
		}
		if(temp)
			System.out.println("it is not a prime number");
		else
			System.out.println("it is a prime number");*/
//2nd approach
			 if(value%i==0)
			 {
				 System.out.println(" it is not a prime number");
				 break;
			 }
			 else if(value%i!=0)
			 {
				 System.out.println(" it is  a prime number"); 
				 break;
			 }

	}

}}
