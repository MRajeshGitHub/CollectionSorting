package com.vs.hashset;

import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TreeSet collection use cases
		
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Roshan");
		ts.add("Nisha");
		ts.add("Shikha");
		ts.add("Shyam");
		System.out.println(ts);//default sorting order print because treeSet internally uses compareTo() method for sorting the data
		
		//compare with Integer data
		TreeSet<Integer> t= new TreeSet<Integer>();
		t.add(10);
		t.add(12);
        t.add(44);
        t.add(58);
        System.out.println(t);//default sorting order is ascending
        
        //compare with Integer and String data
        TreeSet t1= new TreeSet();//without generic
        t1.add(10);
       // t1.add("Rahul");//java.lang.ClassCastException will return because TreeSet Internally used compareTo method for comparing the data in collection object
     //   System.out.println(t1);
        
        //compare with NULL data
        TreeSet t2= new TreeSet();//without generic
        t1.add(10);
      // t1.add(null);
       // System.out.println(t2);//java.lang.ClassCastException, with compare any data to NULL will return CSE ;
    
        
        
        
        
        
        
        
        
		
		


	}

}
