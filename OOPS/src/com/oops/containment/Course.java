package com.oops.containment;

public class Course {
	private int cid;
	private String cname;
	private  double fee;
	public Course() {
		
	}
	public Course(int cid,String cname,double fee) {
		this.cid=cid;
		this.cname=cname;
		this.fee=fee;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString()
	{
		return "Course:"+cid+" "+cname+" ,Fees:"+fee;
	}

}
