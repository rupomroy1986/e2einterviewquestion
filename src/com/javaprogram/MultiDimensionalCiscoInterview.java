package com.javaprogram;

public class MultiDimensionalCiscoInterview {
public static void main(String[] args) {
		int [][] a= {{32,34,55},{12,4,7},{8,15,9}};
		int min=a[0][0];
		int mincoloumn=0;
       for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		if(a[i][j]<min)//2
		{
		min=a[i][j]; //here i is the row and j is the column
		 mincoloumn=j;
		}
		}
		}
		System.out.println(" the minimum value is" +min);
		System.out.println(" the minimum colum is:"  +mincoloumn);
		int k=0;
		int max=a[k][mincoloumn];
		while(k<3) 
		{
			if(a[k][mincoloumn]>max)
			{
				max=a[k][mincoloumn];
			}
			k++;
			
		}
		
		System.out.println("the maximum value in am array is" +max);

	}

}
