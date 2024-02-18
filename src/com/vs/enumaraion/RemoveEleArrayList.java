package com.vs.enumaraion;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Remove the element form array list :");
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Harsh");
		al.add("sakshi");
		al.add("Golu");
		al.add("Simmy");
		System.out.println(al);
		
		// to remove element we need to Iterate the list data
		
		Iterator<String>itr= al.iterator();
		while(itr.hasNext()) {
			String s= itr.next();//holding list element
		//remove logic
			if(s.equals("Simmy"))
				itr.remove();
			
		}
		//acutal list data
		System.out.println(al);
	
		
	}

}
