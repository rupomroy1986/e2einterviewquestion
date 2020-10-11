package com.javaprogram;

public class PatternMatchingOne {
	
	
	//reverse a value
	
			public static void rupom() 
			{
				int k=1;
				for(int i=0;i<4;i++)
				{
					for(int j=0;i>=j;j++)
					{
						
						System.out.print(k);
						System.out.print("\t"); //space between the values
						k++;
						}
					System.out.println("");
				}				
			}

			//another example
			
			public static void rupomroy() 
			{
				
				for(int i=1;i<5;i++)
				{
					for(int j=1;i>=j;j++)
					{
						
						System.out.print(j);
						System.out.print("\t"); //space between the values
						
						}
					System.out.println("");
				}				
			}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t"); //space between the values
				k++;
				}
			System.out.println("");
		}
		System.out.println("reverse a pattern");
		PatternMatchingOne.rupom();
		System.out.println("another pattern matching examples");
		rupomroy();
		

		          
	}

}
