package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s1= {"rupom","roy","victor"};
		//to conver array to arraylist
		          List<String> l1      = Arrays.asList(s1);
		          System.out.println(l1);
		                    Iterator<String> it    =  l1.iterator();
		                    while(it.hasNext())
		                    {
		                    	System.out.println(it.next());
		                    }
		                    
		

	}

}
