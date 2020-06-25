package com.javaprogram;

public class PatterMatchingOne {
	
	public static void main(String[] args)

	{
		String S="#######";
		for(int i=1;i<=S.length();i++)
		{
			for(int j=1;j<=S.length();j++)
			{
				if(i==j || i>=j)
				{
					System.out.print("#");
				}	
		}
			System.out.println();
		}
	}
}
