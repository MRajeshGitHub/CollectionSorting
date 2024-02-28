package com.vs.map;

import java.util.TreeMap;

public class TreeMapConstructors {

	public static void main(String[] args) {
		// Tree map adding collection using constructor pass ref and using putAll methods
		//using constructor 
		TreeMap<String, Integer>t= new TreeMap<String , Integer>();
		t.put("Ajay", 44);
		
		TreeMap<String, Integer>t2= new TreeMap<String , Integer>(t);//pass reference to add collection
		
		t2.put("Vijay", 7);
		System.out.println(t2);
		
		//using putAll methods
		TreeMap<String, Integer>t3= new TreeMap<String , Integer>();//pass reference to add collection
		
		t3.put("Rahul", 11);
		TreeMap<String, Integer>t4= new TreeMap<String , Integer>();//pass reference to add collection
		t4.put("Sunil", 78);
		TreeMap<String, Integer>t5= new TreeMap<String , Integer>();
           t5.putAll(t4);
           t5.putAll(t4);
           t5.putAll(t3);
           t5.put("Sony", 58);
           System.out.println(t5);//print with all collections t3,t4,t5 values
	}

}
