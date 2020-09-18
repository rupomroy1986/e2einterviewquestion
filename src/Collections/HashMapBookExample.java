package Collections;

import java.util.HashMap;
import java.util.Map;

class BookSeven {    
int id;    
String name,author,publisher;    
int quantity;    
public BookSeven(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}

public class HashMapBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,BookFive> map=new HashMap<Integer,BookFive>();    
	    //Creating Books    
	    BookFive b1=new BookFive(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    BookFive b2=new BookFive(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    BookFive b3=new BookFive(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);
	                             
	    
	    for(  Map.Entry<Integer, BookFive>     s1 :map.entrySet())
	    {
	    	  int integerdetails      =s1.getKey();
	    	             BookFive b              =  s1.getValue();
	    	             System.out.println(integerdetails+ "" +"details");
	    	             System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    	             
	    }
		

	}

}
