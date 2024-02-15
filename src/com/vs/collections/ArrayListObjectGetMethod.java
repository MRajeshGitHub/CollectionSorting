package com.vs.collections;

import java.util.ArrayList;

public class ArrayListObjectGetMethod {

	public static void main(String[] args) {
		System.out.println("using get method we can find the object with index based");
		
		ArrayList al= new ArrayList<>();
		al.add(new Student(123, "Ajay"));
		al.add(new Employee(147, "Sanay"));
		//get the data using index based method Get()
		
		//Student s= (Student)al.get(0);
		//System.out.println(s);//exception because index we con,t predict
		// so we need to cast again
		
		 Object o=al.get(0);
		 
		 if(o instanceof Student) {
			 Student s1=(Student)o;
			 System.out.println(s1.sid+ "  "+s1.snme);
			 
			 if(o instanceof Employee) {
				 Employee e1=(Employee)o;
			 System.out.println(e1.eid+ " "+e1.ename);
			 }
		 }
	}
}
