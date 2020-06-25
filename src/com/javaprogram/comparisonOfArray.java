package com.javaprogram;

import java.util.ArrayList;

public class comparisonOfArray {
 //compare the same index of 2 different arrays an create another array of matching values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1, 5,7,15,20};
		int [] b= { 3,4,7,20,55};
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for( int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					System.out.println(b[j]); //7,20
					a1.add(a[i]);
					}
			}
		}
		     Object[] object      = a1.toArray();
		     for( Object c     :object)
		     {
		    	 System.out.println(c); //7,20
		     }

	}

}
