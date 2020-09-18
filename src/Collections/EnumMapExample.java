package Collections;

import java.util.EnumMap;
import java.util.Map;
public class EnumMapExample {
	
	
	public enum days
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<days, String> map = new EnumMap<days, String>(days.class); 
		 map.put(days.MONDAY, "1");
		 map.put(days.TUESDAY, "2");  
		   map.put(days.WEDNESDAY, "3");  
		   map.put(days.THURSDAY, "4");  
		   for(Map.Entry m : map.entrySet())
		   {
			   System.out.println(m.getKey() + "    " +m.getValue());
		   }
		   EnumMap<days, String> map2 = new EnumMap<days, String>(days.class);
		map2  = map.clone();
		System.out.println("after cloniing the value of map2 is:" +map2);
		          System.out.println(map.containsKey(days.TUESDAY));
		          System.out.println(map.containsValue("5"));
		                    System.out.println(map.equals(map2)); //true
		                    System.out.println(map.get(days.SUNDAY)); //null
		                     System.out.println(map.keySet());//[monday, tuesday,wednesday,thrusday]
		                     System.out.println(map.size()); //4
		                     System.out.println(map.values()); //[1,2,3,4]
		                     map.remove(days.THURSDAY, "4");
		                     System.out.println(map);
		           
		   
		   
		   
		   
		   map.clear(); //it will clear the values
		   System.out.println(map);
		   
		 

	}

}
