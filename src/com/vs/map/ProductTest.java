package com.vs.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ProductTest {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// Product data operation with Map collections

		LinkedHashMap<Integer, Product> l= new LinkedHashMap<Integer, Product>();
		l.put(111,new Product(10, "Paper"));
		l.put(222, new Product(11, "Pen"));
		l.put(333, new Product(12, "scales"));
		
		//put into entry set collection
		
		Set<Entry<Integer, Product>> s=l.entrySet();//map entry set
		//iterate the map 
		Iterator<Entry<Integer, Product>>itr =s.iterator();//Iterate the map data
		while(itr.hasNext()) {
			Entry<Integer, Product> e=itr.next();
			Product p=e.getValue();
			if(p.pid==10)
				itr.remove();//removed id =10
			if(p.pname.equals("Pen"))
				itr.remove();//removed name=pen
		}
		//print the map data
		
		for(Entry<Integer, Product> e:s) {
			Integer i= e.getKey();
			System.out.println(i);
			Product p=e.getValue();
			System.out.println(p.pid+", "+p.pname);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
