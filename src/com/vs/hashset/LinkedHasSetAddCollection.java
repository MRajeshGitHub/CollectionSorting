package com.vs.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetAddCollection {

	public static void main(String[] args) {
		// Adding the one collection data into another collection
		//Case-1
		LinkedHashSet<String> lh= new LinkedHashSet<String>();
		lh.add("Rohan");
		lh.add("Rekha");
		lh.add("chandni");
		System.out.println(lh);
		
		HashSet<String> s= new HashSet<String>(lh);//adding one collection to another collection using constructor by passing reference of another collection
		s.add("shubham");
		System.out.println(s);
		LinkedHashSet<String> l1= new LinkedHashSet<String>();
		l1.add("Raja");
		LinkedHashSet<String> l2= new LinkedHashSet<String>();
		l2.add("shiva");
		LinkedHashSet<String> l3= new LinkedHashSet<String>();
		l3.add("kailash");
		//Case-2
		//by using addAll() method we can add multiple collection to one collection
		s.addAll(l1);
		s.addAll(l2);
		s.addAll(l3);
		System.out.println(s);//added all collection to one collection
		s.add("ajay");
		System.out.println(s);//data order in not preserved in LinkedHasSet collection
		
		Set<String> ss= new HashSet<>();//parent can hold child objects
		ss.add("panks");
		ss.add("gautam");
		ss.add("panks");//set not allowed duplicates or ignore next occurrence
		System.out.println(ss);
		
		//Case-3
		//ARRAYLIST ALLWS DUPLICATES
		ArrayList<String>al= new ArrayList<String>();
			al.add("Rani");
			al.add("Salu");
			al.add("Salu");
			System.out.println(al);//duplicate will print here
			
			Set<String> hs= new HashSet<String>(al);
			//hs.add("salu");//ignore the repeated data in hashset
			hs.addAll(al);
			hs.addAll(ss);
			System.out.println(hs);//ignore duplicates
	}

}
