package com.javaprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 543;
		int reverse = 0;
		// here while loop is check for the condition until the remainder is zero.
		while (a != 0) {

			int digit = a % 10;

			reverse = digit + reverse * 10;
			a = a / 10;

		}
		System.out.println(reverse);

	}

}
