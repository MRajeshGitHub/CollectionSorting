package com.vs.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// Checking the hashset collection
		HashSet<String>h= new HashSet<String>();
		h.add("Rajesh");
		h.add("Ajay");
		h.add("Vijay");
		h.add("Rohan");
		h.add("Rajesh");//ignored by hashset rules
		
		System.out.println(h);//INSETTION ORDET IS NOT PRESERVED
		
		//check for duplicate values
		h.add("Rajesh");
		h.add("Rajesh");
		h.add("Rajesh");
		h.add("Rajesh");
		
		HashSet<String> hs= new HashSet<String>();
		//check for duplicate values
		hs.add("Rajesh");
		hs.add("Rajesh");
		hs.add("Rajesh");
		hs.add("Rajesh");
		System.out.println(hs);//duplicate value is avoided here
		
		//with likedHashSet
		LinkedHashSet<String>lh= new LinkedHashSet<String>();
		lh.add("Rajesh");
		lh.add("Ajay");
		lh.add("Vijay");
		lh.add("Rohan");
		lh.add("Rajesh");//ignored by Hashset rules duplicate not allowed
		System.out.println(lh);//INSETTION ORDET IS PRESERVED

	}

}
