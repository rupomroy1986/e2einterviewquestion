package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("15");    
        set.add("12");    
        set.add("10");   
        set.add("27");  
        set.add("14");  
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        } 
		
        System.out.println("it does not allow duplicate values");
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("15");    
        set1.add("12");    
        set1.add("10");   
        set1.add("27");  
        set1.add("14");  
        set1.add("15"); 
        set1.add("10"); 
        
         for(String number:set1)
         {
        	 System.out.println(number);
         }
         System.out.println("printing the values in descending order");
                        Iterator<String> itr       = set1.descendingIterator();
                        while(itr.hasNext())
                        {
                        	System.out.println(itr.next());
                        }
         
         
         System.out.println("adding an element in the set");
         TreeSet<String> set2=new TreeSet();
         set2.add("34");
         set2.add("01");
         set.addAll(set2);
         Iterator<String> it=set.iterator();  
         while(it.hasNext())  
         {  
         System.out.println(it.next());  
         } 
         
         
         System.out.println("removing all the element from the 2nd set");
         set.removeAll(set2);
         System.out.println("eleemnt from the set:"+set);
         
         
         set.removeIf(str->str.contains("27")); 
         System.out.println("removing the value from the 1st set:"+set);
         set.clear();
         System.out.println("printing the empty set:"+set);
         
         
         
         System.out.println("adding Treeset from another collection");
         
         ArrayList<String> list=new ArrayList<String>();  
         list.add("10");  
         list.add("02");  
         list.add("01");  
           
         TreeSet<String> set3=new TreeSet(list);  
         set3.add("34");  
         Iterator<String> itr1=set3.iterator();  
         while(itr1.hasNext())  
         {  
         System.out.println(itr1.next());  
         }  
         System.out.println("removing the first element");
         System.out.println(set3.pollFirst()); //it will remove the first element
         System.out.println(set3);
         System.out.println("removing the last element");
         System.out.println(set3.pollLast()); //it will remove the first element
         System.out.println(set3);
         
         System.out.println("another part of tree sets");
         TreeSet<String> set4=new TreeSet<String>();
         set4.add("A");  
         set4.add("B");  
         set4.add("C");  
         set4.add("D");  
         set4.add("E");  
         System.out.println("Initial Set: "+set4 );  //[a,b,c,d,e]
           
         System.out.println("Reverse Set: "+set4.descendingSet());  //[e.d,c,b,a]
           
         System.out.println("Head Set: "+set4.headSet("C", true));  // [a,b,c]
          
         System.out.println("SubSet: "+set4.subSet("A", false, "E", true)); //[ b,c,d,e]
           
         System.out.println("TailSet: "+set4.tailSet("C", false));  //[d,e]
         System.out.println("Head Set: "+set4.headSet("C"));  //[a,b] //default it is false
         System.out.println("SubSet: "+set4.subSet("A", "E"));  //[a,b,c,d]
         System.out.println("TailSet: "+set4.tailSet("C"));  //[c,d,e] //default it is true
         
         
         
         
		

	}

}
