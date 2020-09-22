package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HastableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  hm.remove(102);
		  System.out.println("After remove: "+ hm);  
		     //Here, we specify the if and else statement as arguments of the method  

		  System.out.println(hm.getOrDefault(101, "Not Found"));  //if it is present it will display the values
		     System.out.println(hm.getOrDefault(105, "Not Found")); //if it is not present, it will not display the values
		     hm.putIfAbsent(104,"Gaurav"); 
		     System.out.println("Updated Map: "+hm);  
		     hm.putIfAbsent(101,"Vijay");  
		     System.out.println("Updated Map: "+hm);  
		     
		     
		     

		     
		     
		  

	}

}
