package com.vs.cloneing_serilization;

import java.util.ArrayList;

public class ArraryListClone {

	public static void main(String[] args) {
		// Cloning ArrayLint collection
		
		ArrayList< String> al= new ArrayList<String>();
		al.add("Rajesh");
		al.add("Simpy");
		al.add("Julie");
		al.add("Shubham");
		System.out.println(al);
		System.out.println(al.hashCode());//print collection
		
		ArrayList<String> copy= (ArrayList<String>)al.clone();//type cast and clone 
		System.out.println(copy);//cloned data print
		System.out.println(copy.hashCode());//clone data will access from heap memory directly for fast processing
		

	}

}
