package com.oops.classobject;
class Employee{
	int eid;
	String ename;
	int esal;
	public void show() {
		System.out.println("Employee ID     : "+eid);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("--------------------------");
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.eid=1;
		e1.ename="om";
		e1.esal=40000;
		
		Employee e2=new Employee();
		e2.eid=2;
		e2.ename="onkar";
		e2.esal=50000;
		
		e1.show();
		e2.show();

	}

}
