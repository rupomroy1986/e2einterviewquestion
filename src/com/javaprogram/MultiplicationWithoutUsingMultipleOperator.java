package com.javaprogram;

public class MultiplicationWithoutUsingMultipleOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     int result     =   multiply(5,10);
		     System.out.println(result);
		     
		     int multiplicationnumber =multiplywhileloop(6,10);
		         
		         System.out.println(multiplicationnumber);

	}
private static int multiplywhileloop(int i, int j) {
	int k=1;
	int sum=0;
	while(k<=j)
	{
	sum	= i+sum;
	k++;
	}
	return sum;
}
	//using for loop
	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int k=1;k<=10;k++)
		{
			  sum    =  i+sum;
		}
		
		
		return sum;
	}
	
	
	

}
