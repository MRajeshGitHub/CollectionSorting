package com.vs.treeset;

import java.util.Comparator;
import java.util.TreeSet;



public class TreeSetComp {

	public static void main(String[] args) {
		// TreeSet data sorting with different type of data 
		//by default TreeSet sorting is acceding order
		
		TreeSet<String> t= new TreeSet<String>(new MyComp());//passing custom sorting logic for decreasing order
		t.add("Ratan");
		t.add("Anuradha");
		t.add("Chandu");
		t.add("Surendra");
		System.out.println(t);//default sorting order in TreeSet is Ascending order
		
		//for Integer data custom sorting
		TreeSet<Integer> t1= new TreeSet<Integer>(new MyComp1());//passing custom sorting logic in constructor
		t1.add(10);
		t1.add(14);
		t1.add(58);
		t1.add(47);
		System.out.println(t1);//default sorting order
		

	} 

}
class MyComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// for custom sorting order in TreeSet and pass in constructor
		return -s1.compareTo(s2);//String comparison for descending order
	}

}

class MyComp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// Integer object for custom object comparison
		//return o1.compareTo(o2);//compare two object
		return -o1.compareTo(o2);//for descending order
	}
	
}







