package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
//end to end program on basics on arraylist
public class ArrayListExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      
	      //Printing the arraylist object   
	      System.out.println(list);  
	                   ListIterator<String> l1      =list.listIterator();
	                   System.out.println("for printing the values in the forward order");
	                    while(l1.hasNext())
	                    {
	                    	
	                    	System.out.println("index:"+l1.nextIndex() + "" + "value:"+l1.next());
	                    }
	                  System.out.println("for printing the values in the backward order");
	                  while(l1.hasPrevious())
	                  {
	                	  System.out.println("index:"+l1.previousIndex() + "" + "value:"+l1.previous());
	                    }
	                 
	      
	      
	      
	//using iterator
	      System.out.println("using iterator");
	           Iterator<String> itr=list.iterator();
	           while(itr.hasNext())
	           {
	        	   System.out.println(itr.next());
	           }
	           System.out.println("using for each loop");
	           for(String fruit:list)
	           {
	        	   System.out.println(fruit);
	           }
	           System.out.println("sorting the element");
	           Collections.sort(list);
	           System.out.println("sorted element for the fruit is" +list);
	                               
	           System.out.println(list.isEmpty());
	                          list.set(2, "dates");
	                          System.out.println("set the value at the index position:"+list);
	           
	           ArrayList<String> list1=new ArrayList<String>();
	           list1.add("orange");
	           list1.add("gauvava");
	           System.out.println("printing the new elemt in the array:"+list1);
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
