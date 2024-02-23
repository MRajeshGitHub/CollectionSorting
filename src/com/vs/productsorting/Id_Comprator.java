package com.vs.productsorting;

import java.util.Comparator;

public class Id_Comprator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// checking the condtion for product ID comparison for sorting
		//for decending order of product ID-change comparison logic P2.pid==p1.pid
		if(p2.pid==p1.pid)
		return 1;
		else if(p2.pid>p1.pid)
			return 0;
		else
			return-1;
	}

}
