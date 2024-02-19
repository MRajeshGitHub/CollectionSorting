package com.vs.product;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Product data operaions with all cursurs :");
		
		Vector<Product> v= new Vector<Product>();
		v.add(new Product(101, "Pen",100));
		v.add(new Product(102, "Rubber",15));
		v.add(new Product(103, "Paper",200));
		//use all cursers to print the product data
		
		Enumeration<Product> e= v.elements();//using enumeration print
		while(e.hasMoreElements()) {
			Product p= e.nextElement();
			System.out.println(p.pid+" ,"+p.pname+","+p.cost);
		}
		System.out.println("----------------------");
		Iterator<Product> itr= v.iterator();//using Itetator data print
		while(itr.hasNext()) {
			Product p =itr.next();
			System.out.println(p.pid+" ,"+p.pname+","+p.cost);
		}
		System.out.println("-----------------------");
		ListIterator<Product> litr= v.listIterator();//using ListIterator data print
		while(litr.hasNext()) {
			Product p =litr.next();
			if(p.pname.equals("Pen"))
				litr.remove();
			if(p.cost==15)
				litr.remove();
			System.out.println(p.pid+" ,"+p.pname+","+p.cost);
			
			
		}
		System.out.println("=========");
		for(Product p:v) {
			System.out.println(p.pid+" ,"+p.pname+","+p.cost); 
		}
	
		
		
		

	}

}
