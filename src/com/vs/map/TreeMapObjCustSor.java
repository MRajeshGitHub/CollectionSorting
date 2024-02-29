package com.vs.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapObjCustSor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Product, Emp> p= new TreeMap<Product,Emp>(new MyComp3());
		p.put(new Product(110, "Sanjit"), new Emp(201, "Laxman"));
		p.put(new Product(121, "Pawan"), new Emp(202, "Ardhad"));
		p.put(new Product(112, "Ranjeet"), new Emp(203, "Sai vara"));
	//	System.out.println(p);
	/*
	 * Set<Entry<Product,Emp>> st=p.entrySet();//map entry return type is Set
	 * Interface Iterator <Entry<Product, Emp>> itr= st.iterator();// Iterate the
	 * Map data
	 */	                       
	                      Set<Product> pp=p.keySet();
	                      for(Product s:pp) {
	                    	  System.out.println(s.pid+","+s.pname);//descending order print
	                      }
	
	}

}
//custom sorting using comparator Interface
class MyComp3 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return - p1.pid.compareTo(p2.pid);
	}

	
	
}
