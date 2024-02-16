package com.vs.enumaraion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("List Iterator dara print");
		ArrayList<String>al= new ArrayList<String>();
		al.add("Praksh");
		al.add("Panksj");
		al.add("Deepak");
		al.add("Raju");
		System.out.println("without any Iteratior :"+al);

		System.out.println("=======================");
		//using List Iterator
		
		//generic version of ListIterator
		ListIterator<String> itr=al.listIterator();//converting list into ListIterator
		while(itr.hasNext()) {
			String ss=(String) itr.next();
			System.out.println(ss);//no element will Print in previous
		}
		// reading in back-word direction
		System.out.println(":----------------");
		while(itr.hasPrevious()) {
			String ss= itr.previous();
			System.out.println(ss);//   note previous is not print firstly
		
		}
		

	}

}
