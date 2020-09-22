package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
		
		
		System.out.println("keys is:"+hm.keySet());
		System.out.println("values is:"+hm.values());
		System.out.println("key-value pair:"+hm.entrySet());
	      

		hm.remove(102);
		System.out.println("after removal of the value is:"+hm);

	}

}
