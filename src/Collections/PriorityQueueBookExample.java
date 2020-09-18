package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class BookThree implements Comparable<BookThree> {  
	//easy topic.ogic needs to be understand on that
int id;  
String name,author,publisher;  
int quantity;  
public BookThree(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}


public int compareTo(BookThree b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}


public class PriorityQueueBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<BookThree> st=new PriorityQueue<BookThree>();  
	    //Creating Books  
		BookThree b1=new BookThree(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		BookThree b2=new BookThree(233,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		BookThree b3=new BookThree(101,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to the queue
	    st.add(b1);  
	    st.add(b2);  
	    st.add(b3);  
	                 
	   for(BookThree b:st)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    	
	    }
	            System.out.println("removing the element one");
	              st.poll();
	              for(BookThree b:st)
	      	    {
	      	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	      	    	
	      	    }  
	            
	            

	}

}
