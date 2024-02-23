package com.vs.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpTest {

	public static void main(String[] args) {
		// Using LinkedHashSet add the employee data into list and print using Iterator courser
		LinkedHashSet<Employee> le= new LinkedHashSet<Employee>();
		le.add(new Employee(456, "Sanjay", "Hyd"));
		le.add(new Employee(457, "Shrinivas", "Chennai"));
		le.add(new Employee(458, "Ramesh", "Vizag"));
		le.add(new Employee(459, "Pawan", "Banglor"));
		
		//Iterate the list data
		
	Iterator<Employee> itr	=le.iterator();//Iterate the object data
	while(itr.hasNext()) {
		Employee e=itr.next();
		if(e.eadd.equals("Hyd"))//remove operation
			itr.remove();
		if(e.eid==459)
			itr.remove();
		if(e.eadd.equals("Vizag"))
			itr.remove();
	
		System.out.println("Iterated data :"+e.eid+","+e.ename+","+e.eadd);//PRINT USING COURSER
	}
	System.out.println("---------------------------------------");
	System.out.println("LinkedHashSet Data using forEach :");
	System.out.println("---------------------------------------");
	for(Employee e:le) {
		System.out.println(e.eid+","+e.ename+","+e.eadd);//PRINT USING FOREACH LOOP
	}

	}

}
