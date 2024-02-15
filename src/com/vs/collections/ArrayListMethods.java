package com.vs.collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ArrayList Basic Methos...");
		ArrayList al= new ArrayList<>();
		al.add("Rajesh");
		al.add(null);
		al.add('P');
		al.add(10.36);
		al.add("Java");
		System.out.println(al);//normal print as it is
		System.out.println(al.remove(2));//remove the element of 2 index
		System.out.println("after remove ele :"+al);
		System.out.println("size of arrayList is :"+al.size());
		System.out.println("Insert element into 3 index");
		al.add(2, "ajay");
		System.out.println(al);
		//System.out.println(al.remove(12));//exception because arr out of bound
		al.remove("ajay");
		al.remove("sss");//ignore by the compiler
		System.out.println(al);
		al.set(3, "vijay");//set the values by index
		System.out.println(al);
		System.out.println(al.isEmpty());//boolean output
		al.clear();
		System.out.println(al.isEmpty());
		
		//al.remove(10);//remove method always take as a index value....
		System.out.println(al);//empty list


	}

}
