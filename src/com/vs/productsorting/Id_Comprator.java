package com.vs.productsorting;

import java.util.Comparator;

public class Id_Comprator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// checking the condtion for product ID comparison for sorting
		if(p1.pid==p2.pid)
		return 1;
		else if(p1.pid>p2.pid)
			return 0;
		else
			return-1;
	}

}
