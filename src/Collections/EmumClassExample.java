package Collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class EmumClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<days> s1 =EnumSet.allOf(days.class);
		          Iterator<days> itr        = s1.iterator();
		          while(itr.hasNext())
		          {
		        	  System.out.println("days of the week is:"+itr.next());
		        	  }
		          Set<days> s2 =EnumSet.noneOf(days.class);
		          System.out.println("none of the days is:"+s2);
		                  Set<days> s3           = EnumSet.of(days.THURSDAY,days.SATURDAY);
		                          System.out.println(s3);
		                          Set<days> s4       = EnumSet.copyOf(s3);
		                          System.out.println(s4);
		          
		  
		
		

	}

}
