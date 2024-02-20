package com.vs.emp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmpSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al= new ArrayList<Emp>();
		al.add(new Emp(401, "Rajesh"));
		al.add(new Emp(404, "Kartik"));
		al.add(new Emp(403, "Shubham"));
		al.add(new Emp(402, "Preeti"));
		//System.out.println(al);//normal print 
		//sorting
		Collections.sort(al);//we need to implements sort logic in Emp class with the help of Comparable class
		//print data using forEach loop
		for(Emp ee:al) {
			System.out.println(ee.eid+","+ee.ename);
		}

	}

}
