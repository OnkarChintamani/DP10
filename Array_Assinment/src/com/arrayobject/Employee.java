package com.arrayobject;

import java.util.Arrays;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary,Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept=dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", Dept="+dept+"]";
	}

	
}
