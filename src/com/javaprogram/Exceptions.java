package com.javaprogram;

import java.io.IOException;

class M{  
	 void method(){  
	  throw new ArithmeticException("device error");

	  
	 }  
	}  
public class Exceptions {

	public static void main(String[] args)  {
//here we are declaring the exception
		
		M m =new M();
          m.method();
    	  System.out.println("hello");

        
           
	}

}
