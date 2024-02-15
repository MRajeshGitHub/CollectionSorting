package com.vs.collections;

import java.util.ArrayList;

public class ArrayListConstructors {

	public static void main(String[] args) {
		System.out.println("array list consturctors");
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		ArrayList<Integer> al1= new ArrayList<>(al);//adding list to another list in constructor
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
	}
}
