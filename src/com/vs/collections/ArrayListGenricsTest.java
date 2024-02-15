package com.vs.collections;

import java.util.ArrayList;

public class ArrayListGenricsTest {

	public static void main(String[] args) {
		
		int [ ]arr= {10,20,30,40,50};
		for(int ar:arr)
		System.out.println(ar);//array are type safe by defoult
		System.out.println("-----------------------------------");
		ArrayList<Employee> el= new ArrayList<Employee>();
		el.add(new Employee(147, "Rohan"));
		el.add(new Employee(148, "Rohit"));
		el.add(new Employee(149, "Rajesh"));
		for(Employee ee:el) {
			System.out.println(ee.eid+"  "+ee.ename);
		}
		//here no type checking required because ArrayList is Employee(generics) type....
		System.out.println("--------------------------------");
		Employee e1= el.get(0);
		System.out.println(e1.eid+","+e1.ename);
	
		
		
	}

	
}
