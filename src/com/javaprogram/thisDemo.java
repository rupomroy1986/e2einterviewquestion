package com.javaprogram;

public class thisDemo {
	
	int a=2;
	public void getData() {
		int a=3;
		System.out.println(this.a);
		System.out.println(a);
		int c= this.a+a;
		System.out.println(c);
		               
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td=new thisDemo();
		td.getData();
	}

}
