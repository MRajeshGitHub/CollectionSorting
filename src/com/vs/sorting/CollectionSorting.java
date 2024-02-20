package com.vs.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection shorting :");
		//Case Type-1
		ArrayList<String> al= new ArrayList<String>();
		al.add("Rajesh");
		al.add("Ratan");
		al.add("Anuradha");
		al.add("Anjali");
		//string and wrapper class by default applies shorted order
		System.out.println("Before sort :"+al);
		Collections.sort(al);
		System.out.println("After sort :"+al);//short in alphabetical order
		
		LinkedList<Integer>ll= new LinkedList<Integer>();
		ll.add(10);
		ll.add(12);
		ll.add(20);
		ll.add(14);
		System.out.println("Before short :"+ll);
		Collections.sort(ll);
		System.out.println("After short :"+ll);
		//This all case not type safe means not a generic version of collection
		//Case Type-2 class castException
		ArrayList al2= new ArrayList<>();
		al2.add(10);
		al2.add("ajay");
		//Collections.sort(al2);//( java.lang.ClassCastException)
	//	System.out.println(al2);//throw ClassCastException because internally compareTo method will running to compare the list objects
		 
		//Case Type-3 NullPointerException
		Vector v= new Vector<>();
		v.add(10);
		v.add(null);
		//Collections.sort(v);// java.lang.NullPointerException: ---> if we compare any object with null, we will get java.lang.NullPointerException always

	}

}
