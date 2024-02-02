package com.oops.constructor;

public class Student {
	private int sid;
	private String sname;
	public Student() {
		
	}
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	public void show() {
		System.out.println("sid :"+sid);
		System.out.println("sname :"+sname);
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public int getSid(){
		return sid;
	}
	public void setSname(String name) {
		this.sname=sname;
	}
	public String getSname() {
		return sname;
	}

}
