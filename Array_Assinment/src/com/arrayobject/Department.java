package com.arrayobject;

public class Department {
	private int did;
	private String dname;
	private String dloc;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname, String dloc) {
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	@Override
	public String toString() {
		return "Depratment [did=" + did + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	

}
