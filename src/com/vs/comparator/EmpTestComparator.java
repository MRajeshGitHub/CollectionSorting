package com.vs.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmpTestComparator {

	public static void main(String[] args) {
		ArrayList<Emp> al= new ArrayList<Emp>();
		al.add(new Emp(222, "Ajay"));
		al.add(new Emp(555, "Ravi"));
		al.add(new Emp(666, "Varun"));
		al.add(new Emp(236, "Kartik"));
		//sort logic
		//Collections.sort(al, new Eid_comp());
		Collections.sort(al,new Eid_comp());
		//Collections.sort(al,new EnameComparator());
		//print using forEach loop
		for(Emp e:al) {
			System.out.println(e.eid+","+e.ename);
		}
	}
}
