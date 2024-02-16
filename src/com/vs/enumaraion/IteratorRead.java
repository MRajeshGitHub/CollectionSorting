package com.vs.enumaraion;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reading the data using Iterator");
		ArrayList<String>al= new ArrayList<String>();
		al.add("Raju");
		al.add("vijay");
		al.add("Sanjay");
		al.add("mahendra");
		System.out.println("without using Iterator :"+al);
		
		//without generic data reading
	Iterator itr =al.iterator();//holding object in Iterator Interface
	while(itr.hasNext()) {
		String ss=(String)itr.next();//casting required
		System.out.println(ss);
	}
	System.out.println("---------------------------");
	//with generic data reading
	
	Iterator<String> itr1= al.iterator();
	while(itr1.hasNext()) {
		String ss=itr1.next();//casting not required here because Iterator itself hold String type
		System.out.println(ss);
	}
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
