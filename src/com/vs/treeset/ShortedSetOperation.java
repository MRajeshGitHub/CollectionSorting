package com.vs.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class ShortedSetOperation {

	public static void main(String[] args) {
		// SortedSet Operation with TreeSet collection and methods
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		for(int i=0;i<=10;i++) {
			ts.add(i);
		}
		System.out.println(ts);//10 element will add in set collection
		
		//sorted set operations
		//subset operations
		SortedSet<Integer>ss =ts.subSet(2, 8);//form 2-8 elements print
		System.out.println(ss);

		//tail opetations
		SortedSet<Integer> ss1= ts.tailSet(5);//from 5-10 elements print
		System.out.println(ss1);
		
		//hesdSet operation

		SortedSet<Integer> ss2 = ts.headSet(2);//from 0,1 elements print
		System.out.println(ss2);
		
		
		
	}

}
