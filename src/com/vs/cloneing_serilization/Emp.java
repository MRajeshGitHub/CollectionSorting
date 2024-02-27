package com.vs.cloneing_serilization;

import java.io.Serializable;

public class Emp  implements Serializable{

	//reansient variable is performed only into variables and not participate into Serialization  process
	  int eid;// in output default value of Integer value will get
	String ename;
	//transient String ename;//default value is NULL
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
}
