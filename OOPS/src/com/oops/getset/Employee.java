package com.oops.getset;
//encapsulation means binding/wrapping data together in sigle unit
//this unit known as class
//encapsulation is use for hinding data form outside access
//in encpsulation, we can achiver by declaring instatnce variable as private
//private variable can access whithin same class
//private instance variable can be access by using public methods called getters and setters

//setters - use to set data(this keyword)
//public void setVariableName(datatype variable){}

//getters - se to retrive data
//public returntype getVariableName(){}
public class Employee {

	private int eid;
	private String ename;
	private double esal;
	
	public void setDetails(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	public void showDetails() {
		System.out.println("Eid : "+eid);
		System.out.println("Ename : "+ename);
		System.out.println("Esal : "+esal);

	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEsal(double esal) {
		this.esal=esal;
	}
	public double getEsal() {
		return esal;
	}
}
