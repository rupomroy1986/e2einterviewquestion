package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

class BookSix {    
int id;    
String name,author,publisher;    
int quantity;    
public BookSix(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    

public class LinkedHashMapBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,BookSix> map=new LinkedHashMap<Integer,BookSix>(); 
		 BookSix b1=new BookSix(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		 BookSix b2=new BookSix(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		 BookSix b3=new BookSix(103,"Operating System","Galvin","Wiley",6);  
		 map.put(3,b2);  
		 map.put(1,b1);  
		 map.put(2,b3);  
		    for(Map.Entry<Integer, BookSix> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        BookSix b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    
		    

	}

}
