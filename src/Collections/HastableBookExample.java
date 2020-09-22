package Collections;

import java.util.Hashtable;
import java.util.Map;

class BookNine {    
int id;    
String name,author,publisher;    
int quantity;    
public BookNine(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}}    
public class HastableBookExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,BookNine> map=new Hashtable<Integer,BookNine>(); 
		//Creating Books    
		BookNine b1=new BookNine(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		BookNine b2=new BookNine(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		BookNine b3=new BookNine(103,"Operating System","Galvin","Wiley",6);    
		//Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	    
	    for(Map.Entry<Integer, BookNine> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        BookNine b=entry.getValue(); 
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }   
	   System.out.println("value of the key is"+map.keySet());
	
}

}
