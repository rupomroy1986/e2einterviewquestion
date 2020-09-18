package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<String>();  
	        list.add("C");  
	        list.add("Core Java");  
	        list.add("Advance Java");  
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, "Servlet","JSP");  
	        System.out.println("After adding elements collection value:"+list);  
	        System.out.println("total number of elements in the arraylits:"+list.size());
	        String[] strArr = {"C#", ".Net"};  
	        Collections.addAll(list, strArr);  
	        System.out.println("After adding array collection value:"+list);  
	        System.out.println("********************************");
	        ArrayList<Integer> list1 = new ArrayList<Integer>();  
	        list1.add(46);  
	        list1.add(67);  
	        list1.add(24);  
	        list1.add(16);  
	        list1.add(8);  
	        list1.add(12);  
	        System.out.println("Value of maximum element from the collection: "+Collections.max(list1)); 
	        System.out.println("Value of minimum element from the collection: "+Collections.min(list1)); 
	        
	         System.out.println("*******************************************************");
	         Collections.swap(list, 0, 3);
	         System.out.println("after swapping the element in the collections:"+list);
	         System.out.println("*******************************************************");
	         ArrayList<String> srclist = new ArrayList<String>(5);  
	          ArrayList<String> destlist = new ArrayList<String>(10);  
	          //Populate two source and destination lists  
	          srclist.add("Java Tutorial");  
	          srclist.add("is best on");  
	          srclist.add("JavaTpoint");  
	          
	          destlist.add("JavaTpoint");  
	          destlist.add("is older than");  
	          destlist.add("SSSIT");  
	          // copy into destination list  
	          Collections.copy(destlist, srclist);              
	          System.out.println("Elements of source list: "+srclist);  
	          System.out.println("Elements of destination list: "+destlist);  
	          
	          System.out.println("*******************************************************");
	          List<Integer> source = Arrays.asList(1,2,3,4);  
              List<Integer> dest = Arrays.asList(5,6,7,8,9,10);  
              Collections.copy(dest, source);  
              //Print the List  
              for(Integer i : dest) {  
                System.out.print(i +" ");  //[1,2,3,4,9,10]
              }  
	                  
              System.out.println("*****************String Object in Sorting algorithm********************");
              ArrayList<String> al=new ArrayList<String>();  
              al.add("Viru");  
              al.add("Saurav");  
              al.add("Mukesh");  
              al.add("Tahir");  
                
              Collections.sort(al);  
              Iterator itr=al.iterator();  
              while(itr.hasNext()){  
              System.out.println(itr.next());  
               }  
	        
	        
              System.out.println("*****************String Object in reverse order********************");
              ArrayList<String> a2=new ArrayList<String>();  
              a2.add("Viru");  
              a2.add("Saurav");  
              a2.add("Mukesh");  
              a2.add("Tahir");
              Collections.reverse(a2);
              System.out.println(a2);
                
              
              System.out.println("*****************String object sorting and in in reverse order********************");
              ArrayList<String> a3=new ArrayList<String>();  
              a3.add("Viru");  
              a3.add("Saurav");  
              a3.add("Mukesh");  
              a3.add("Tahir");
              Collections.sort(a2,Collections.reverseOrder());
              System.out.println(a2);
              
              System.out.println("*****************Sort using wrapper class********************");
              ArrayList a4=new ArrayList();  
              a4.add(Integer.valueOf(201));  
              a4.add(Integer.valueOf(101));  
              a4.add(230);//internally will be converted into objects as Integer.valueOf(230)  
                
              Collections.sort(a4);  
                
              Iterator itr3=a4.iterator();  
              while(itr3.hasNext()){  
              System.out.println(itr3.next());  
               }  
              

	}

}
