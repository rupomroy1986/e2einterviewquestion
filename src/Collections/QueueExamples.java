package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
		queue.add("Xerox");
		System.out.println(queue);
		System.out.println("head of the queue:"+queue.element());
		System.out.println("head of the queue:"+queue.peek());
		 queue.remove();
		 System.out.println("after removal of the head element:"+queue);
		 queue.poll();
		 System.out.println("after removal of the head element:"+queue);
		 System.out.println(queue.poll());
		 System.out.println(queue.poll());
		 System.out.println(queue);
		                 Iterator<String> s1      =queue.iterator();
		                 while(s1.hasNext())
		                 {
		                	 System.out.println(s1.next());
		                 }
		                 
		        		 System.out.println(queue.poll()); //it will print vijay
		        		 System.out.println(queue); //[xerox]

  
		 

	}

}
