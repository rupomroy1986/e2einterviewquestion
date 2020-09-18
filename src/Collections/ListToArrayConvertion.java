package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("hello");
		l1.add("rupom");
		l1.add("victor");
		l1.add("seo");
		System.out.println(l1.get(2));
		     Object[] obj =l1.toArray();
		     for(Object s1:obj)
		     {
		    	 System.out.println(s1);
		     }
		

	}

}
