package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	      map.remove(102);
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      map.put(102,"Ravi");
	      
	      System.out.println("descendingMap: "+map.descendingMap());
	      System.out.println("headMap: "+map.headMap(102, true));
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      System.out.println("1st element in the map is:"+map.pollFirstEntry());
	      System.out.println(map);
	      System.out.println("subMap: "+map.navigableKeySet());
	      System.out.println("subMap: "+map.subMap(101, false, 102, true));
	      System.out.println("**********************************************");
	      System.out.println("headMap: "+map.headMap(102)); //[101] without using boolean expression
	      System.out.println("tailMap: "+map.tailMap(102)); //[102,103]
	      System.out.println("subMap: "+map.subMap(100, 102));   //between the values [101]
	      Object map2=new TreeMap<Integer,String>();  
	    map2   =map.clone();
	    System.out.println(map2);
	      


	      

	      

	}

}
