package com.vs.collections;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList<>();
		
		al.add(100);//auto boxing internally form java 1.5 on-words
		al.add(10.3);
		al.add("Rajesh");
		al.add(null);
		al.add('s');
		al.add(Character.valueOf('b'));
		al.add(Integer.valueOf(99));//1.4 version to ass primitive data into collation
		System.out.println(al);//toString called internally
		System.out.println(al.toString());
		System.out.println(al.toString());
	}
}
