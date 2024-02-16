package com.vs.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionAarryToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("ARRAY TO COLLECTION CONVERSTION");
       String [] name= {"ajay","vijay","sanjay","pankaj"};
       
       //conversion  array to collection using Arrays.asList(array object reference);
       
       ArrayList< String> al= new ArrayList<String>(Arrays.asList(name));
       
       System.out.println(al);
       System.out.println("_______________");
       
       ArrayList<String> al1= new ArrayList<String>();
       al1.add("Raju");
       al1.add("vikash");
       al1.add("mahesh");
       //conversion generic collection to array using toArrarys
       
       String [] s=  new String[al1.size()];
       al1.toArray(s);//conversion
       
       for(String ss:s) {
    	   System.out.println(ss);
       }
       System.out.println("__________________");
       //conversion normal collection to arrays                          //toArray() ->without arguments
                                                                                                             //toArray(arg) ->with arguments
       ArrayList al2= new ArrayList();
       al2.add("shiva");
       al2.add("ligil");
       al2.add(10);
       
       Object [] o= al2.toArray();//conversion to array and hold in object array

       for(Object oo:o) {
    	   System.out.println(oo);
       }
       
       
       
       
       
       
       
       
       
       
	}

}
