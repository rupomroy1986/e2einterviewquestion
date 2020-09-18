package Collections;

import java.util.HashSet;
import java.util.Iterator;

class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class HashSetBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Book> set=new HashSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	                 Iterator<Book> itr          = set.iterator();
	                 while(itr.hasNext())
	                 {
	                Book b	 =itr.next();
	                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	                 }
	                 
	    
	    
	    for(Book b:set)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }

	}

}
