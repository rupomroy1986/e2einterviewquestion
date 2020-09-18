package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("*************no duplicate keys*********************");
		   
		   HashMap<Integer,String> map1=new HashMap<Integer,String>();//Creating HashMap    
		   map1.put(1,"Mango");  //Put elements in Map  
		   map1.put(2,"Apple");    
		   map1.put(3,"Banana");   
		   map1.put(1,"Grapes"); //trying duplicate key  
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map1.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("**********adding elements********************");
		   
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		       
		      System.out.println("After invoking put() method ");  //{}
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map2=new HashMap<Integer,String>();  
		      map2.put(104,"Ravi");  
		      map2.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map2.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      map2.remove(100);
		      System.out.println(map2);
		      map2.remove(102,"Rahul");
		      System.out.println(map2);
		      System.out.println("**********replace elements********************");
		      map2.replace(103, "rupom");
		      System.out.println(map2);
		      map2.replace(101, "Vijay", "roy");
		      System.out.println(map2);
		      
			   
		      

		   
		   

	}

}
