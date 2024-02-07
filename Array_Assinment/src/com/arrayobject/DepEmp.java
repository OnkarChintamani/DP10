package com.arrayobject;

import java.util.Iterator;

public class DepEmp {
	static void sortSal(Employee[] e) {
		Employee temp=new Employee();
		for (int i = 0; i < e.length; i++) {
			for (int j = i+1; j < e.length; j++) {
				if(e[i].getSalary()>e[j].getSalary())
				{
					temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}
	}
	static void findMaxSal(Employee[] e) {
			double max=e[0].getSalary();
			Employee temp=new Employee();
			for (int i = 0; i < e.length; i++) {
				if(e[i].getSalary()>max)
					temp=e[i];
			}
			System.out.println("\t\t--------Max_Sal--------");
			System.out.println(temp);
	}
	public static void main(String[] args) {
		Department[] d1=new Department[3];
		d1[0]=new Department(1, "Account", "Pune");
		d1[1]=new Department(2, "Marketing", "Mumbai");
		d1[2]=new Department(3, "Sales", "Pune");
		
		Employee[] e1=new Employee[3];
		e1[0]=new Employee(101, "om", 10000, d1[0]);
		e1[1]=new Employee(102, "onkar", 2000, d1[1]);
		e1[2]=new Employee(103,"Rushi",500000,d1[2]);
		
		e1[2].setEid(104);
		e1[2].setEname("Rushikesh");
		e1[2].setSalary(400000);
		e1[2].setDept(d1[0]);
		
		for (Employee employee : e1) {
			System.out.println(employee);
		}
		System.out.println("\t\t--------sort------------");
		sortSal(e1);
		for (Employee employee : e1) {
			System.out.println(employee);
		}
		findMaxSal(e1);
	}	
	
}
