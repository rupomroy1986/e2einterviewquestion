package com.javaprogram;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*
		 * a.remove(1); 
		 * a.remove("java"); 
		 * System.out.println(a);
		 */
		System.out.println(a.get(2)); // java
		System.out.println(a.contains("java")); //true
		System.out.println(a.indexOf("rahul")); //1
		System.out.println(a.isEmpty()); //false
		System.out.println(a.size());//4
	}

}
