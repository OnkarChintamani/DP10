package com.oops.constructor;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		System.out.println("Default consturctor");
	}
	public Employee(int n) {
		System.out.println("Parameterized constructor "+n);
	}
	public void show() {
		System.out.println("show ");
	}
}
