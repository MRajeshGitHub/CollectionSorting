package com.vs.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSubListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("arraylist sublist and swap methos");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rajesh");
		al.add("java");
		al.add(".Net");
		al.add("Python");
		al.add("Vijay");
		System.out.println("Befor swap the data :"+al);
		//to swap we use her collection class method
		Collections.swap(al, 1, 3);
		System.out.println("After swap :"+al);
		
		//for sublist data
		ArrayList<String>as= new ArrayList<String>(al.subList(2, 3));//include 2-index exclude 3-index
		System.out.println("after sublist :"+as);
		
		
		
		
	}

}
