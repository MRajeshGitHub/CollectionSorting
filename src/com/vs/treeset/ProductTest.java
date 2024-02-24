package com.vs.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class ProductTest {

	public static void main(String[] args) {
		// TteeSet collection with product data
		
		TreeSet<Product> tp= new TreeSet<Product>(new MyComp2());
		tp.add(new Product(859, "Car", 945850));
		tp.add(new Product(858, "Cycle", 1458));
		tp.add(new Product(860, "Scooter", 55850));
		tp.add(new Product(861, "Bike",345850));
		
		//printing the product data using forEach loop
		for(Product p:tp) {
			System.out.println(p.pid+","+p.pname+","+p.pcost);//java.lang.ClassCastException because TreeSet sort only String and wrapped data.
			//TreeSet data must be comparable to print.
		}
		//solution for custom data sorting for product data
			}
}

class MyComp2 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// Custom logic for product data sorting
		//return p1.pname.compareTo(p2.pname);//print in ascending order
		return -p1.pname.compareTo(p2.pname);//print in Descending order
	}
	
	
	
	
}