package com.vs.collections;

import java.util.ArrayList;

public class ObjestArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(new Student(101,"Rajesh"));
		al.add(new Employee(111, "Guru"));
		al.add(10);
		al.add(null);
		al.add("Rakhee");
		System.out.println(al.toString());
		System.out.println(al);
		
		
		//note  -> collection is not type safe because always we need to check type checking and convert into type cast all the way..
		//where is array are type safe
		System.out.println("==================");
		//print using forEach loop with different data
		for(Object o:al) {
			
			if(o instanceof Employee) {
			Employee e= (Employee)o;
			System.out.println(e.eid+"   "+e.ename);
			}
			if(o instanceof Student) {
				Student s= (Student)o;
				System.out.println(s.sid+"  "+s.snme);
			}
			if(o instanceof Number)
				System.out.println(o);
			
			if(o== null)
				System.out.println(o);
			
			if(o instanceof String)
				System.out.println(o);
			
			
		}
	}
}
