package Collections;

import java.util.EnumMap;
import java.util.Map;

class BookFive {    
int id;    
String name,author,publisher;    
int quantity;    
public BookFive(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    

public class EnumMapBookExample {
	// Creating enum  
    public enum Key{  
           One, Two, Three  
           };  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Key,BookFive> map=new EnumMap<Key,BookFive>(Key.class);
		BookFive b1=new BookFive(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		BookFive b2=new BookFive(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		BookFive b3=new BookFive(103,"Operating System","Galvin","Wiley",6);
	    map.put(Key.One, b1);  
	       map.put(Key.Two, b2);  
	       map.put(Key.Three, b3);  
	    // Traversing EnumMap  
	       for(Map.Entry<Key, BookFive> entry:map.entrySet()){      
	    	   BookFive b=entry.getValue();    
	            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);     
	        }       
	    
		
		
		

	}

}
