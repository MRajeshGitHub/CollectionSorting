package com.vs.map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// Linked Hash Map collection with student and employee data entry set
		
		LinkedHashMap<Emp, Student> ll= new LinkedHashMap<Emp,Student>();
		ll.put(new Emp(11, "Arjun"), new Student(222, "Rohan"));
		ll.put(new Emp(12, "Sonu"), new Student(333, "Rakhee"));
		ll.put(new Emp(13, "Mdhavi"), new Student(444, "lakshn"));
		//print the entry set values
		
		System.out.println("key of map");
		Set<Emp>s=ll.keySet();//Emp data as a key values...
		for(Emp e:s) {
			System.out.println(e.eid+","+e.ename);
		}
		System.out.println("values of the map");
		Collection<Student> c=ll.values();
		for(Student st:c) {
			System.out.println(st.sid+","+st.sname);
		}
		
		//Entry of the map
		/*
		 * Set<Entry<Emp, Student>> map= ll.entrySet(); for(Entry<Emp, Student> ee:map)
		 * {//print using forEach loop will return hash code System.out.println(ee);// }
		 */
		System.out.println("Map data------------------------------");
		//print Entry using Iterator with key and values form
		Set<Entry<Emp, Student>> es=ll.entrySet();
		Iterator< Entry<Emp, Student>> itr=es.iterator();//convert into iterator
		 while(itr.hasNext()) {
			 Entry<Emp, Student> ee=itr.next();
			 //emp data object
		Emp e	= ee.getKey();
		System.out.println(e.eid+","+e.ename);
		//student data object
		Student ss= ee.getValue();
		System.out.println(ss.sid+","+ss.sname);
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
		

	}

}
