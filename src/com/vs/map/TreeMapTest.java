package com.vs.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// Tree Map use cases
		
		TreeMap<String, Integer> t= new TreeMap<String ,Integer>();
		t.put("Arjun", 44);
		t.put("Rohit", 24);
		t.put("Sagar", 74);
		t.put("Jhon", 14);
		System.out.println(t);//sorting based on key in treeMap
		//out put ->  {Arjun=44, Jhon=14, Rohit=24, Sagar=74}//alphabetical orders
		
		TreeMap<Integer, String> t2= new TreeMap<Integer,String>();
		t2.put(14, "rohan");
		t2.put(65, "Jumi");
		t2.put(18, "vikash");
		t2.put(11, "pankaj");
		System.out.println(t2);//sorting based on Key value which is Integer type
		//{11=pankaj, 14=rohan, 18=vikash, 65=Jumi} natural sorting order is asccending order

	}

}
