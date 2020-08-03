package com.javaprogram;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		hm.put(4, null);
		hm.put(null, null);
		//it allows only unique key
		//it allows one null key and multiple null values
		//it does not maintain any insertion order
		//hm.put(null, "rupom");
		System.out.println(hm);
		System.out.println(hm.get(42)); // morning
		hm.remove(42);
		System.out.println(hm.get(42)); // null
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		// hashtable -pass table set collections

		while (it.hasNext()) {
			// System.out.println(it.next()); //it will be confusion for the object
			// which value to be triggered so it ie giving the exception
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}

	}

}
