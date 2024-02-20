package com.vs.comparator;

import java.util.Comparator;

public class EnameComparator  implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.ename.compareTo(e2.ename);
	}

}
