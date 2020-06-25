package com.javaprogram;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for ( int j=0;j<5;j++)
			{
				if(i==j || i>=j)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		

	}

}
