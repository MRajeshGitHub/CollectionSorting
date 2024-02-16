package com.vs.enumaraion;

import java.util.Enumeration;
import java.util.Vector;

public class EnumaraionRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading the Enumaraion data with Vector :");
		//without generic
		Vector v= new Vector<>();//legacy class
		v.add("Rohan");
		v.add("Pampa");
		v.add("chandni");
		v.add("surendra");
		System.out.println(v);
		//reading using Enumerations
		System.out.println("---------------------");
		Enumeration s=v.elements();//getting the enumeration object
		while(s.hasMoreElements()) {
			String ss=(String)s.nextElement();//convert enumeration  object data to String  data
			System.out.println(ss);//print enumeration way
		}
		 System.out.println("Enumeration with generics");
		 System.out.println("_______________________");
		 
		 Enumeration<String> ss= v.elements();//String type of object store here
		 while(ss.hasMoreElements()) {
			 String s1=ss.nextElement();//type cast not required here because enum is String type of data
			 System.out.println(s1);
		 }
		
		
		
		
		
		
		
		
		

	}

}
