package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//end to end program on basics on arraylist
public class LinkedListExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();//Creating linkedlist  
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
	      System.out.println("printing the value for the linkedlist:"+list);  
	      
	      
	//using iterator
	      System.out.println("using iterator for linkedlist");
	           Iterator<String> itr=list.iterator();
	           while(itr.hasNext())
	           {
	        	   System.out.println(itr.next());
	           }
	           System.out.println("using for each loop for linkedlist");
	           for(String fruit:list)
	           {
	        	   System.out.println(fruit);
	           }
	           System.out.println("sorting the element for linkedlist");
	           Collections.sort(list);
	           System.out.println("sorted element for the fruit is" +list);
	           Collections.reverse(list);
	           System.out.println("sorting the element in descending order:" +list);
	           System.out.println("another way for descending the sorting is as below");
	                    Iterator<String> a1         = list.descendingIterator();
	                    while(a1.hasNext())
	                    {
	                    	System.out.println(a1.next());
	                    }
	           
	                    
	                    System.out.println(list.isEmpty());
	                          list.set(2, "dates");
	                          System.out.println("set the value at the index position:"+list);
	           
	           LinkedList<String> list1=new LinkedList<String>();
	           list1.add("orange");
	           list1.add("gauvava");
	           System.out.println("printing the new element in the linked array list:"+list1);
	           System.out.println("combining both the array");
	           list.addAll(list1);
	           System.out.println("adding the element of the two array");
	           for(String fruit:list)
	           {
	        	   System.out.println(fruit);
	           }
	              list.removeAll(list1);
	              System.out.println("after removing all the enelemets:" +list);
	              list.clear();
	              System.out.println("it will return empty array:" +list);

	           
	}

}
