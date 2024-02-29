package com.vs.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomSort {

	public static void main(String[] args) {
		// Ttee Map with custom sorting
		
		TreeMap<Integer, String> t= new TreeMap<Integer, String>( new MyComp());//passing custom sorting constructor
		t.put(11, "Veer");
		t.put(78, "divya");
		t.put(14, "sushmita");
		t.put(15, "Radhika");
		t.put(21, "Ritika");
		System.out.println(t);//natural print->{11=Veer, 14=sushmita, 15=Radhika, 21=Ritika, 78=divya}
		
			}

}
//Custom sorting  with comparator  Interface
class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2.compareTo(i1);// Descending order 
	}
	
}