package com.javaprogram;

import java.io.IOException;

import javax.naming.InsufficientResourcesException;

class Amount{  
	int balance;
	
	public Amount(int balance) {
    this.balance= balance;
	}
	 public void withdraw(int amount) throws InsufficientBalamceException 
	 {
		 if(amount<=balance)
		 {
			 System.out.println("successful withdraw");
		 }
		 else
		 {
			 throw new InsufficientBalamceException();
		 }
		 
	 }
	
}  
public class InsufficientBalamceException extends Exception  {

	public static void main(String[] args)    {
//here we are declaring the exception
		
		Amount m =new Amount(12000);
		try {
			m.withdraw(55000);
			System.out.println("rupom");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

        
           
	}

}
