package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
int rollno;
String name;
int age;

public Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	
}

public class ArrayListExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25); 
		  System.out.println(s1);
		  System.out.println(s2);
          System.out.println(s3);
          ArrayList<Student> a1=new ArrayList<Student>();
          System.out.println("just printing the reference variables");
           a1.add(s1);
           a1.add(s2);
           a1.add(s3);
              Iterator<Student> itr = a1.iterator();
              while(itr.hasNext())
              {
            	 Student st=itr.next();
            	 System.out.println(st.rollno +"  " +st.name + "  " +st.age);
              }
              System.out.println("another way");
              for(Student s4: a1)
              {
            	  System.out.println(s4.rollno +"  " +s4.name + "  " +s4.age);
              }
            	  
              
          


	}

}
