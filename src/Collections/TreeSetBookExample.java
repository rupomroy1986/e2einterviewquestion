package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class BookTwo implements Comparable<BookTwo> {  
	//easy topic.ogic needs to be understand on that
int id;  
String name,author,publisher;  
int quantity;  
public BookTwo(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}


public int compareTo(BookTwo b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}


public class TreeSetBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<BookTwo> st=new TreeSet<BookTwo>();  
	    //Creating Books  
		BookTwo b1=new BookTwo(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		BookTwo b2=new BookTwo(233,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		BookTwo b3=new BookTwo(101,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to treeset
	    st.add(b1);  
	    st.add(b2);  
	    st.add(b3);  
	                 
	   for(BookTwo b:st)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }

	}

}
