package Collections;

import java.util.Map;
import java.util.TreeMap;

class BookEight {    
	int id;    
	String name,author,publisher;    
	int quantity;    
	public BookEight(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
	}  
public class TreeMapBookExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,BookEight> map=new TreeMap<Integer,BookEight>();    
	    //Creating Books    
		BookEight b1=new BookEight(103,"Let us C","Yashwant Kanetkar","BPB",8);    
		BookEight b2=new BookEight(107,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		BookEight b3=new BookEight(100,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	    //Traversing map  
	    for(Map.Entry<Integer, BookEight> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        BookEight b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
		  
		

	}

}
