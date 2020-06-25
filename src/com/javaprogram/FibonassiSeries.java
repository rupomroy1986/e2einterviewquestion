package com.javaprogram;

public class FibonassiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int sum;
		for(int i=1;i<10;i++)
		{
			  sum  =  a+b;  
			  System.out.println(sum);
			        a   = b;
			           b  = sum;
		}
			//with while loop
		 int i=1;
		while(i<10)
		{
			sum  =  a+b;  
			
			  System.out.println("otput with while loop:"+sum);
			        a   = b;
			        b  = sum;
			i++;
		}

	}

}
