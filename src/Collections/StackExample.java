package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		Boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);  //true
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk); // [78,113,90,120]
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  //false
		    int a      =stk.peek();
		    System.out.println("1st element at the top of the stack is:" +a); //120
		    System.out.println("***************search method in stack*************");
		    System.out.println(stk.search(120));
		int size   = stk.size();
		System.out.println("The stack size is: "+size);  
		//iteration over the stack  
		System.out.println("***************using iterator*************");
		Iterator<Integer> iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();
		System.out.println(values);   
		}    
		
		//invoking forEach() method for iteration over the stack  
		System.out.println("***************for each method*************");
		stk.forEach(n ->  
		{  
		System.out.println(n);  
		});  
		System.out.println("***************using list iterator*************");

		ListIterator<Integer> ListIterator = stk.listIterator(stk.size());
		while(ListIterator.hasPrevious())
		{
			System.out.println(ListIterator.previous());
					
		}
		
		        System.out.println("removing the element from the top of the stack is:"+stk.pop());
		        System.out.println("value in the stack is as follows:" +stk);
		        System.out.println("removing the element from the top of the stack is:"+stk.pop());
		        System.out.println("value in the stack is as follows:" +stk);
		

	}

}
