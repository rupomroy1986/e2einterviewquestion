package com.javaprogram;

public class abcDemo {

	public int a = 10;
	int b = 20;
	private int c = 20;
	protected int d = 30;
	protected int e=50;
	int f=60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		try {
			/*
			 * int e=a/0; System.out.println(e);
			 */
			int[] ab = new int[7];
			System.out.println(ab[10]);

		}

		catch (ArithmeticException e) {
			System.out.println("i catched the Arithmetic/exception");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("i catched the arrayexception");
		} catch (Exception e) {
			System.out.println("i catched the error/exception");
		} 
	
	finally {
			System.out.println("finally block will get executed");
		}

	}

}
