package com.javaprogram;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int [] a= { 5, 13,4, 2,15,14,1};
		for ( int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					 temp  = a[i];
					       a[i] =a[j];
					             a[j]   =temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
