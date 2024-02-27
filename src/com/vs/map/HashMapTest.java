package com.vs.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//HashMap collection with Key and Value pare data
		
		HashMap<Integer, String> h= new HashMap<Integer,String>();
		h.put(111, "Rajan");
		h.put(14, "Sonu");
		h.put(5, "Arjun");
		h.put(8, "Mukund");
		h.put(78, "Sharad");
		System.out.println(h);//insertion order is not preserved in HashMap collection
		
		//get key values
	  Set<Integer>s = h.keySet();
	  System.out.println("Key Values of map object"+s);
	  
	  //get value of map
	  			Collection<String> v	=h.values();
	  			System.out.println("Collection Values is :"+v);
	  			
	  			//Entry map data
	  			
	  			Set<Entry<Integer,String>> map= h.entrySet();
	  			System.out.println(map);//insertion is not preserved
	  			
	  			//print using forEach loop
	  			
	  			for(Entry<Integer,String> e:map) {
	  				System.out.println(e.getKey()+"   "+e.getValue());
	  			}
	  			
	  			
	  			
	  			
	  			

	}

}
