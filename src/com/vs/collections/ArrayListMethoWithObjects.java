package com.vs.collections;

import java.util.ArrayList;

public class ArrayListMethoWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array list methos with object data");
		//contain,containAll,remove,removeAll,retain,retainAll
		
		Employee e1=new Employee(111, "Roshan");
		Employee e2=new Employee(112, "Rajan");
		Employee e3=new Employee(113, "Rohit");
		Employee e4=new Employee(114, "Praksh");
		Employee e5=new Employee(115, "Pankaj");
		System.out.println("--------------------------------------");
		//System.out.println(e1);
		//adding the object data into ArrayList collection
		
		ArrayList<Employee> e= new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		ArrayList<Employee> e11= new ArrayList<Employee>();
		e11.addAll(e);   //adding collection to another collection
		e11.add(e3);
		e11.add(e4);
		e11.add(e5);
		// print using forEach 
		
		
		/*
		 * System.out.println(e11.contains(e1)); System.out.println(e11.containsAll(e));
		 * e11.remove(e1); System.out.println(e11.contains(e1));
		 * System.out.println(e11.containsAll(e));
		 */
		 
		//e11.removeAll(e);       //remove all element of e collection
		e11.retainAll(e);              // except e collection removed all
 		
		System.out.println("===============");
		for(Employee es:e11) {
			System.out.println(es.eid+" ,"+es.ename);
		}
		
		
		
		
		
		

	}

}
