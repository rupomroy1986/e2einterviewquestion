package com.javaprogram;

public class bal extends abcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String url ="https://rahulshettyacademy.com/getCourse.php?code=4%2FyAEG_JzVF9-ejBBnIQGT5T8xaJqYGgRTIXGjVGpE3It8ziS9yBTAhYAdGwLcmo0BzqeibE5fI-O9Uhhl1JHEqxU&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#";
System.out.println(url);

String partialcode=url.split("code=")[1];	
System.out.println(partialcode);
//String partialcode=url.split("code=")[1];
String code=partialcode.split("&scope")[0];
System.out.println(code);
		
		
		
		String str = "geekss@for@geekss"; 
		System.out.println(str);
        String[] arrOfStr = str.split("@", 2); 
  
        for (String a : arrOfStr) 
            System.out.println(a);
        bal bc=new bal();
           System.out.println(bc.e);
           System.out.println(bc.f);
        
	}

}
