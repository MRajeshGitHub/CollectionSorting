package com.vs.emp;

public class Emp  implements Comparable<Emp> {//normal version 

	int eid;
	String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	/*
	 * @Override public int compareTo(Object o) { //logic for sorting Emp
	 * e=(Emp)o;//casting for object class if(eid==e.eid) return 0;// with no change
	 * else if(eid>e.eid) return 1;//with change else return-1;// with no change }
	 */
	@Override
	public int compareTo(Emp e) {
		// compare with name and genetic version
		
		return ename.compareTo(e.ename);
	}
	
}
