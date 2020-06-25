package com.javaprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="rupom";
		String S2="";
		for(int i=S1.length()-1;i>=0;i--)
		{
			S2  = S2  +S1.charAt(i);
		}
		System.out.println(S2);
		if(S1.equals(S2))
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("it is not palindrome");
		}
	}

}
