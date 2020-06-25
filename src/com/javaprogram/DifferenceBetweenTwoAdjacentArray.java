package com.javaprogram;

public class DifferenceBetweenTwoAdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//difference between the two adjacent array
		int [] a= {1,4, 8, 15,17}; //3,4,7,2
		int temp=0;
		for( int i=0;i<a.length-1;i++)
		{
		int difference	=a[i+1]-a[i];
		System.out.println(difference);
		}
		
	for(int j=0;j<a.length-1;j++)
	{
		
		if(a[j+1]-a[j]>temp)
		{
			temp=a[j+1]-a[j];
		}
		}
	System.out.println("highest difference between the adjacent array");
	System.out.println(temp);

}
}