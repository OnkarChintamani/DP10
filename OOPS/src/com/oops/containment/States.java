package com.oops.containment;

public class States {
	private int stid;
	private String stname;

	public States() {
		
	}
	public States(int stid,String stname) {
		this.stid=stid;
		this.stname=stname;
	}
	public void setStid(int stid) {
		this.stid=stid;
	}
	public int getStid() {
		return stid;
	}
	public void setStname(String stname) {
		this.stname=stname;
	}
	public String getStname() {
		return stname;
	}
	public String toString() {
		return "state_id: "+stid+"\nstate_name: "+stname;
	}
}
