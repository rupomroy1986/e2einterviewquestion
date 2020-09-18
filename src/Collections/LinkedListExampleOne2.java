package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class StudentOne{
int rollno;
String name;
int age;

public StudentOne(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	
}

public class LinkedListExampleOne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOne s1=new StudentOne(101,"Sonoo",23);  
		  StudentOne s2=new StudentOne(102,"Ravi",21);  
		  StudentOne s3=new StudentOne(103,"Hanumat",25); 
		  System.out.println(s1);
		  System.out.println(s2);
          System.out.println(s3);
          List<StudentOne> a1=new LinkedList<StudentOne>();
          System.out.println("just printing the reference variables");
           a1.add(s1);
           a1.add(s2);
           a1.add(s3);
           for(StudentOne values:a1)
           {
        	   System.out.println(values.rollno+ " " +values.name+ " " +values.age);
        	   
           }
              
            	  
              
          


	}

}
