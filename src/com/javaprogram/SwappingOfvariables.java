package com.javaprogram;

public class SwappingOfvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swapping with temp variables
		int a=5;
	    int b=6;
	    int temp;
		
                   //swaping with temp variables
	              temp  =    a;
	                    a     =b;
	                        b   = temp;
	                        System.out.println("otput with temp variables");
	                        System.out.println(a);
	                        System.out.println(b);
	                        
	                        //without using temp variables
	                         a=a+b; //a=11
	                         b=a-b; //b=5
	                         a=a-b;//6
	                        	 System.out.println("output withou temp variables");
		                        System.out.println(a);
		                        System.out.println(b);
	}

}
