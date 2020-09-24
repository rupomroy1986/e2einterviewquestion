package Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant"); 
       System.out.println("--Elements of Vector are--");  
        for(String str:vec)
        {
            System.out.println("elements of vector are= " +str);
        }
        
       System.out.println("if vector contaisn the value as:"+vec.contains("Elephant"));//true
       System.out.println("if vector contains all the value as:"+vec.containsAll(vec));//true
       System.out.println("index of the elemt in the vector is:"+vec.indexOf("Dog")); //2
                      vec.insertElementAt("snake", 3);
                      System.out.println("after inserting the element by using the insertelementat is:"+vec);
                      System.out.println("Is the Vector empty?:" +vec.isEmpty()); //false
                      System.out.println("Element at index 3 is = "+vec.get(3)); //snake as it is changed the value in the previous steps
                      vec.forEach(System.out::println);
              System.out.println("first element of the vector is:" +vec.firstElement());
              
              
              Enumeration<String> enumobject = vec.elements();  
              System.out.println("Data in enumeration object is: ");  
              while (enumobject.hasMoreElements())  
              {             
                  System.out.println("Element: " +enumobject.nextElement());
              }  
              
              System.out.println("Element at index 2 is:" +vec.elementAt(2));
              

        
        Vector<String> vec2 = new Vector<>();               
        //Add elements in the second vector  
        vec2.add("zebra");  
        vec2.add("cat");  
        System.out.println("***************adding all the element in another vector****************");
        vec.addAll(vec2);
        System.out.println("Final vector list: "+vec);
      //Adding elements using addElement() method of Vector  
        System.out.println("***************adding all the element at the end of the vector****************");
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer"); 
        System.out.println("Elements are: "+vec); 
        System.out.println("clonning of the values is:"  +vec.clone());
        System.out.println("***************using iterator****************");
      //Obtain an Iterator  
        Iterator<String> itr = vec.iterator();  
        while(itr.hasNext()){  
             System.out.println(itr.next());  
        }
        
        System.out.println("last element of the vector is:"  +vec.lastElement()); //Deer
        System.out.println("last index of the vector is:"  +vec.lastIndexOf("zebra")); //5
        vec.remove("snake");
        System.out.println("Elements are removing is: "+vec); 
        vec.removeElementAt(2);
        System.out.println("Elements removing at the index position: "+vec); 
          Collections.replaceAll(vec, "Deer", "ball");
          System.out.println("After replacing: "+vec); 
          System.out.println("hashcode of the vector is:"+vec.hashCode());

        
        vec.removeAll(vec);
        System.out.println("after removing  from the vector is:" +vec); //[]
        vec.removeAllElements();
        System.out.println("after removing all the elements from the vector is:" +vec.size()); //0
       System.out.println("Default capacity is: "+vec.capacity()); //to be checked latter
        vec.clear();
        System.out.println("***************it will clear the vector:" +vec);
        
        System.out.println("*****************copyinto******************");
        //Create an empty Vector1  
        Vector<Integer> vec1 = new Vector<>();     
        //Add elements in the vector  
        vec1.add(1);  
        vec1.add(2);  
        vec1.add(3);  
        vec1.add(4);  
        vec1.add(5);                   
        Integer[] arr = new Integer[5];       
        //copy elements of vector into an array  
        vec1.copyInto(arr);    
        System.out.println("Elements in an array are: ");  
        for(Integer num : arr)  
        {  
            System.out.println(num);  
        }   
            
        Vector<Integer> vec3 = new Vector<>();     
        //Add elements in the vector  
        vec3.add(1);  
        vec3.add(2);  
        vec3.add(3);  
        vec3.add(4);  
        vec3.add(5);
        System.out.println(vec1.equals(vec3));//true
        System.out.println("after cloning of the element is:" +vec3.clone());
        
        
        

        
        

        
		
		
		

	}

}
