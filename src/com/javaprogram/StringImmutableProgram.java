package com.javaprogram;

public class StringImmutableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is immutable
		String a="hello"; //literal
		String b="hello";
		      a.concat("world");
		      System.out.println(a);
		           System.out.println(a.equals(b)); //true
		           System.out.println(a==b);//true
		           String s=new String("hello");
		           String s1=new String("hello");
		           System.out.println("value of s is" +s);
		           System.out.println("@@@@@@@@@@@@@@@@@");
		           System.out.println(a.equals(s));//true
		           System.out.println(a==s); //false
		           System.out.println("@@@@@@@@@@@@@@@@@");


		           System.out.println(s==s1); //false
		           System.out.println(s.equals(s1));//true
		           System.out.println("string buffer comparisonssssssssssssssssss");
		           
		           StringBuffer sb3=new StringBuffer("rupomroy123");
		           StringBuffer sb4=new StringBuffer("rupomroy123");
		           System.out.println(sb3.equals(sb4)); //false
		           System.out.println(sb3==sb4);//false
		           System.out.println("added the two scenarion based on string buffer");
		           System.out.println("**********************************");
		           
		           String a1=new String("soma");
		           String a2=new String("soma");
		           System.out.println(a1.equals(a2)); //true
		           System.out.println(a1==a2);//false
		           System.out.println(a1);
		           System.out.println("***xxxxxxxxxxxxxxxxxxxx");

		           
		           
		           
		      
		           /*string mutable
		           String buffer and string builder*/
		           StringBuffer sb=new StringBuffer("hello");
		           StringBuffer sb1=new StringBuffer("hello");
		           StringBuffer sb2=new StringBuffer("hello");
		           System.out.println(sb);
		           sb.append("world");
		           System.out.println(sb); //helloworld
		           sb.insert(2, "rupom");
		           System.out.println(sb); //herupomlloworld
		           sb.replace(3, 13, "ia");
		           System.out.println(sb); //herupomilowoald //herupomiaoworld
		           sb.deleteCharAt(6);
		           System.out.println(sb); //herial
		           System.out.println(sb.reverse());
		                 

		           
		           
		      

	}

}
