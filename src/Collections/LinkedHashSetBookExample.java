package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class BookOne {  
int id;  
String name,author,publisher;  
int quantity;  
public BookOne(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class LinkedHashSetBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<BookOne> set=new LinkedHashSet<BookOne>();  
	    //Creating Books  
	    BookOne b1=new BookOne(105,"Let us C","Yashwant Kanetkar","BPB",8);  
	    BookOne b2=new BookOne(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    BookOne b3=new BookOne(101,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3); 
	    
	                 Iterator<BookOne> itr          = set.iterator();
	                 while(itr.hasNext())
	                 {
	                BookOne b	 =itr.next();
	                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	                 }
	                 
	                 
	    
	    
	    for(BookOne b:set)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }

	}

}
