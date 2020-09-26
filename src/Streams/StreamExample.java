package Streams;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamExample {
//name start with A-count it.
	@Test
	public void regular() {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Abhijeet");
		a1.add("Don");
		a1.add("Alekhya");
		a1.add("Adam");
		a1.add("Rupom");
		int count=0;
		for(int i=0;i<a1.size();i++)
		{
	     String actual= a1.get(i);
	        if(actual.startsWith("A"))
	        {
	         count++;
		}}
		System.out.println(count);
		}

@Test
public void streamFilter() {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Abhijeet");
	a1.add("Don");
	a1.add("Alekhya");
	a1.add("Adam");
	a1.add("Rupom");
	
	long abc    =a1.stream().filter(s->s.startsWith("A")).count();
	System.out.println(abc);
	long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Rupom").filter(s->
	{
		s.startsWith("A");
		return false;
	}).count();
	System.out.println(d); //output will be zero as we have set intermediate operator as false
	 //a1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 //based on the limit
	 a1.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	 
	
	
	
}


@Test
public void streamMap()
{
	Stream.of("Abhijeet","Don","Alekhya","Adam","Rupoma").filter(r->r.endsWith("a")).map(r->r.toUpperCase()).forEach(r->System.out.println(r));
}

@Test
public void sorted() {
	
	         List<String> names=Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rupoma");
	         names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	         names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	     }

@Test
public void mergingList() {
	
	List<String> names=Arrays.asList("Rupom","Victor");	
	List<String> names1=Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rupoma");
	//merging the two list
	Stream<String> newstring=Stream.concat(names.stream(),names1.stream());
	//once stream is modified wer cant do other stream function on that
	           //newstring.sorted().forEach(s->System.out.println(s));
	            boolean b1       =newstring.anyMatch(s->s.equalsIgnoreCase("Victor"));
	            System.out.println(b1);
	            Assert.assertTrue(b1);
	}
@Test
public void streamCollect()
{
	List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Rupom").filter(r->r.endsWith("a")).map(r->r.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
}
	
@Test
public void uniqueNumberInArray() {
	       List<Integer> values     =Arrays.asList(3,2,2,7,5,1,9,7);
	                  values.stream().distinct().forEach(s->System.out.println(s));
	                  System.out.println("sorting and finding the value at index 3");
	               List<Integer> l1   =values.stream().sorted().collect(Collectors.toList());
	               System.out.println(l1.get(3));
	
}
}
