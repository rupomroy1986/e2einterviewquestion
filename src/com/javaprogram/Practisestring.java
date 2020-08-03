package com.javaprogram;

public class Practisestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "javatpoint rupom";
		String s2 = "javatpoint rupom";
		String s3 = "JAVATPOINT RUPOM";
		String s4 = "JAVATPOINT RUPOM INDIAN";
		String s5 = "java is world java";
		String s6 = "      javatpoint     rupom     ";
		int b = 10;

		int a = s1.length();
		System.out.println(a); // 10
		System.out.println(s1.substring(4, 8)); // tpoi
		System.out.println(s1.contains("rupom")); // true
		System.out.println(s1.join("-", "javatpoint", "rupom"));
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.isEmpty()); // false
		System.out.println(s1.concat("java"));
		System.out.println(s1.replace('j', 't')); // tavatpoint rupom
		System.out.println(s1.equalsIgnoreCase(s3));// true
		String[] a1 = s1.split(" ");
		for (String a2 : a1) {
			System.out.println(a2);
		}
		String value = s1.split(" ")[1];
		System.out.println(value); // rupom
		System.out.println(s1.indexOf("v")); // 2
		System.out.println(s1.indexOf("rupom")); // 11
		// index of a after 10
		System.out.println(s5.indexOf('a', 10)); // 15
		System.out.println(s4.toLowerCase()); // javatpoint rupom indian
		System.out.println(s6.trim());
		String s7 = String.valueOf(b);
		System.out.println(s7 + 7);

	}

}
