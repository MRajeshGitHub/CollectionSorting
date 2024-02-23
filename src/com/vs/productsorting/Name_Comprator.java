package com.vs.productsorting;

import java.util.Comparator;

public class Name_Comprator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		//sorting logic for name : compareTo() required because name is String value
		return p1.pname.compareTo(p1.pname);
	}

}
