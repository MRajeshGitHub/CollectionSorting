package com.vs.books;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIeratiorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("list Iterator data :");
		ArrayList<String> al= new ArrayList<String>();
		al.add("Rajesh");
	   al.add("Shubham");
	   al.add("JUlie");
	   System.out.println(al);
	   
	   //Iterate the Objest data
	   System.out.println("-----------------------");
	 ListIterator<String> litr= al.listIterator();
	 litr.add("Vijay");
	 //System.out.println(litr.toString());//adding the data into listIterator not in List
	 while(litr.hasNext()) {
		 String ss=litr.next();
		 if(ss.equals("Rajesh"))
			 litr.set("Praksh");//set the new data in the list
		 if(ss.equals("Shubham"))
			 litr.remove();//remove the data
		 System.out.println(ss);
	 }
	 System.out.println(al);//vijay will show in list firstly because courser is pointing into first position

	}

}
