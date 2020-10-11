package com.javaprogram;



public class StaticVariable {
	//instance variables
String name;
String surname;
    public static String city;
       //public static String city="bangalore";

    public String state="karnataka";
    static int a=10;
    
    //another way of writing the code in customized way is:below is the static block.
    static
    {
    	city="bangalore";
    	a=10;
    }
    
    
	public StaticVariable(String name, String surname)
	{
		this.name=name;
		this.surname=surname;
		a++;
		System.out.println(a);
		
		
		
	}
	
	public void getData() {
		 
		System.out.println(name+ " " +surname+ " " +state);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sd=new StaticVariable("rupom","roy");
		StaticVariable sd1=new StaticVariable("victor","dey");
		    sd.getData();
		    sd1.getData();
		      System.out.println(StaticVariable.city);
		     System.out.println(StaticVariable.a=19);
		      
		      
		
		
	}

}
