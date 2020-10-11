package com.javaprogram;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7; int c=0; 
		try { 
			//it will catch the 1st exception
			int k=b/c;
			int arr[]=new int[5];              
         System.out.println(arr[7]);         
         } 
		catch(ArithmeticException e) 
		{ 
			System.out.println("I catched the Arthimetic/exception"); 
			} catch(IndexOutOfBoundsException e) 
		{ 
				System.out.println("I catched the IndexBound/exception"); 
				} 
		catch(Exception e) 
		{ 
			System.out.println("I catched the error/exception"); 
			} 
		finally 
		{ 
			//THis block is executed irrespective of exception thrown or not  
			System.out.println("delete cookies");

		}

		}

		


	}


