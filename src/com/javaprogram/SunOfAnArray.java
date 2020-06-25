package com.javaprogram;

public class SunOfAnArray {
//method which accepts array and returns the sum of all the element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		
	int addition	=sumofarray(a);
	System.out.println(addition);
	}	
		
		
		public static int sumofarray(int [] a)
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum  = a[i]+sum;
			}
			return sum;
			
		}
		
}
	


