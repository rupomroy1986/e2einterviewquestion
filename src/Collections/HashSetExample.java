package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        } 
		System.out.println("it does not allow duplicate values");
		HashSet<String> set1=new HashSet<String>();
		set1.add("One");    
        set1.add("Two");    
        set1.add("Three");   
        set1.add("Four");  
        set1.add("Five");
        set1.add("Four"); 
         for(String number:set1)
         {
        	 System.out.println(number);
         }
         
         System.out.println("adding an element in the set");
         HashSet<String> set2=new HashSet();
         set2.add("seven");
         set2.add("ten");
         set.addAll(set2);
         Iterator<String> it=set.iterator();  
         while(it.hasNext())  
         {  
         System.out.println(it.next());  
         } 
         System.out.println("removing all the element from the 2nd set");
         set.removeAll(set2);
         System.out.println("eleemnt from the set:"+set);
         set.removeIf(str->str.contains("One")); 
         System.out.println("removing the value from the 1st set:"+set);
         set.clear();
         System.out.println("printing the empty set:"+set);
         System.out.println("adding hashset from another collection");
         
         ArrayList<String> list=new ArrayList<String>();  
         list.add("Ravi");  
         list.add("Vijay");  
         list.add("Ajay");  
           
         HashSet<String> set3=new HashSet(list);  
         set3.add("Gaurav");  
         Iterator<String> itr1=set3.iterator();  
         while(itr1.hasNext())  
         {  
         System.out.println(itr1.next());  
         }  
         
		

	}

}
