package com.oops.covariant;

class Person{
	int id;
	String name;
	Person(){
		
	}
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	Person showDetailes() {
		name=name+"Indian";
		return this;
	}
	
}
class Employee extends Person{
	double salary;
	Employee(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
//	Person showDetailes() {
//		name=name+"Think";
//		salary=salary+10000;
//		return this;
//	}
	Employee showDetailes() {
		name=name+"Think";
		salary=salary+10000;
		return this;
	}
}
public class CoveriantDemo {
	public static void main(String[] args) {
		Person p;
		Employee e;
//		p=new Employee(1, "om", 20000);
//		p.showDetailes();
//		System.out.println(	p.id+" "+p.name+" "+p.salary);
		Employee e1=new Employee(1, "om", 100000);
		e=e1.showDetailes();
		System.out.println(e.id+" "+e.name+" "+e.salary);
	}
}
