package com.vs.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vector Test");
		
		//ArrayList and Vector both are same only methods are synchronized in vector
		Vector<String> v = new Vector<String>(2,5);//initial capacity check
		System.out.println(v.capacity());
		v.add("rajan");
		v.add("sunil");
		v.add("sona");
		System.out.println(v.capacity());
		System.out.println(v);
		
		ArrayList<String> al= new ArrayList<String>(v);//adding collection to arrayList
		//any collection we add into any collection by passing reference to next contrucors
		al.add("ajay");
		al.add("vijay");
System.out.println(al);//both collection value will get here//
		
	}

}
