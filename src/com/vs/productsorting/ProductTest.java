package com.vs.productsorting;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest {

	public static void main(String[] args) {
		// LinkedList data sorting using comparator Interface
		LinkedList<Product> ll= new LinkedList<Product>();
		ll.add( new Product(147, "Pen", 10.0));
		ll.add( new Product(148, "Books", 210.0));
		ll.add( new Product(149, "StudtBoard", 400.0));
		ll.add( new Product(146, "penBox", 120.0));
		//sorting logic
		Collections.sort(ll, new Name_Comprator());////sorting with NAME comparison of product
		//Collections.sort(ll,new Id_Comprator());//sorting with Id comparison of product
		//printing the product data using forEach loop
		
		for(Product p:ll) {
			System.out.println(p.pid+","+p.pname+","+p.pcost);
		}
		

	}

}
