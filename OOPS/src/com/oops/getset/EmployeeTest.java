package com.oops.getset;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e1=new Employee();
			e1.setDetails(1, "om", 50000);
			e1.showDetails();
			//e1.ename;        //private
			e1.setEsal(100000);
			System.out.println(e1.getEsal());
			e1.showDetails();
			e1.setEid(10);
			System.out.println(e1.getEid());
			e1.showDetails();
            e1.setEname("omkar");
			System.out.println(e1.getEsal());

	}

}
