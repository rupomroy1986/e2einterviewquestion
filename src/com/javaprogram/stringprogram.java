package com.javaprogram;

public class stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String : it is one of the prebuilt class in java
		/*
		 * 1.String literal 2.by creating object of string
		 */

		String a = " javatraining";// string
		String b="rupom";

		System.out.println(a.charAt(2)); // a
		System.out.println(a.charAt(a.length()-1));
		System.out.println(a.indexOf("e")); // -1
		System.out.println(a.substring(2, 11)); // avatrai
		System.out.println(a.substring(5)); // training
		System.out.println(a.concat("rahul teaches")); // javatraining rahul teaches
		System.out.println(b.length()); // 5
		System.out.println(a.trim()); // javatraining
		System.out.println(a.toUpperCase());// JAVATRAINING
		System.out.println(a.toLowerCase()); // javatraining
		// split
		String[] abc = a.split("r");
		System.out.println(abc[0]); // javat
		System.out.println(abc[1]); // aining
		System.out.println(a.replace("t", "s")); // javasraining
		System.out.println(b.indexOf("rupom"));
		

	}

}
