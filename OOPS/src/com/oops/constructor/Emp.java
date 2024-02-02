package com.oops.constructor;

public class Emp {
	private int eid;
	private String ename;
	private double esal;
	public Emp() {
		this(0,null,0.0);
		System.out.println("Default");
		int eid=0;
		ename=null;
		esal=10000;
		
	}
	public Emp(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	public Emp(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
		
	}
	public void setEsal(double esal) {
		this.esal=esal;
			}
	public double getEsal() {
		return esal;
	}
		public String toString() {
			return "Employee id: "+eid+"\nEmployee name: "+ ename+"\nEmployee salary: "+esal;
		}
	
}
