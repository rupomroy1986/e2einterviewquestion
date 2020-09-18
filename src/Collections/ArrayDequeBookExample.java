package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class BooksOne {  
int id;  
String name,author,publisher;  
int quantity;  
public BooksOne(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class ArrayDequeBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<BooksOne> set=new ArrayDeque<BooksOne>();  
	    //Creating Books  
	    BooksOne b1=new BooksOne(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    BooksOne b2=new BooksOne(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    BooksOne b3=new BooksOne(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	                 Iterator<BooksOne> itr          = set.iterator();
	                 while(itr.hasNext())
	                 {
	                BooksOne b	 =itr.next();
	                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	                 }
	                 
	    
	    System.out.println("*************************************************");
	    for(BooksOne b:set)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }

	}

}
