package com.oops.constructor;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		System.out.println(	e1.toString());
		System.out.println("------------------------");
		
		Emp e2=new Emp(1, "om");
		System.out.println(	e2.toString());
		System.out.println("-------------------------");
		
		e2.setEsal(10000);
		System.out.println("Employee Salary :"+e2.getEsal());
		System.out.println("---------------------------");
		
		Emp e3=new Emp(2, "onkar", 2000000);
		System.out.println(	e3.toString());
		System.out.println("------------------------------");
		System.out.println(	e2.toString());
	}

}
