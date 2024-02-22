package com.vs.comparator;

import java.util.Comparator;

public class Eid_comp implements Comparator <Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// logic for comparison
		if(o1.eid==o2.eid)
		return 0;
		else if(o1.eid>o2.eid)
			return 1;
		else
			return-1;
	}

	

	

	
}
