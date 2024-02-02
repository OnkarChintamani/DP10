package com.oops.getset;

public class Student {
	private int sid;
	private String sname;
	private double smarks;
	
	public void setDetails(int sid,String sname,double smarks) {
		this.sid=sid;
		this.sname=sname;
		this.smarks=smarks;
	}
	public void showDetails() {
		System.out.println("Student Id    :"+sid);
		System.out.println("Student Name  :"+sname);
		System.out.println("Student Marks :"+smarks);
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public int getSid() {
		return sid;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public String getSname(){
		return sname;	
	}
	public void setSmarks(double smarks) {
		this.smarks=smarks;
	}
	public double getSmarks() {
		return smarks;
	}
}
