package com.javaprogram;

public class CountOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=occurance("aaabbcca",'a');
				System.out.println(count);

	}

	private static int occurance(String word, char character) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count ++;
			}
		}
		
		
		return count;
	}

}
