package com.vs.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapCons2 {

	public static void main(String[] args) {
		// Ttee Map collection with sorted constructor
		
		TreeMap<Integer, String> tm= new TreeMap<Integer,String>();
		tm.put(22, "arun");
		tm.put(7, "Jaya");
		tm.put(88, "Radhika");
		tm.put(4, "Rahul");
		tm.put(14, "Anu");
		System.out.println(tm);//print as {4=Rahul, 7=Jaya, 14=Anu, 22=arun, 88=Radhika}
		
		//short data form TreeMap collection 
		SortedMap<Integer, String> tm1= tm.subMap(4, 22);
		System.out.println(tm1);//{4=Rahul, 7=Jaya, 14=Anu}
		
		//tail map
		   SortedMap<Integer, String> tm2= tm.tailMap(7);
		   System.out.println(tm2);//tail means upper values//print->{7=Jaya, 14=Anu, 22=arun, 88=Radhika}
		   //head map
		   SortedMap<Integer, String> tm3=  tm.headMap(14);
		   System.out.println(tm3);// 14-below data form list {4=Rahul, 7=Jaya}
		   
		   
		   
		   
	}

}
