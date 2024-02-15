package com.vs.collections;

import java.util.ArrayList;

public class ArraylistAddCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using one collection to another collection
		
		ArrayList< Integer>al= new ArrayList<Integer>();
		al.add(100);
		ArrayList<Integer> a2= new ArrayList<Integer>(al);
		a2.add(200);
		System.out.println(a2);
		//using addAll() also we can add collection to another collection...
		
	
		ArrayList<Integer> b1= new ArrayList<Integer>();
		b1.add(400);
		ArrayList<Integer> b2= new ArrayList<Integer>();
		b2.add(500);
		ArrayList<Integer> b3= new ArrayList<Integer>();
		b3.add(600);
		
		System.out.println(b3);
		
		b3.addAll(b1);
		b3.addAll(b2);
		System.out.println(b3);
		

	}

}
