package com.oops.methodoverriding;
class Person{
	public Person() {
		
	}
	 void display(String name) {
		System.out.println("Indian Person");
	}
	
}
class Employee extends Person {
	@Override
	protected void display(String name) {
		super.display(name);

		System.out.println("Indian employee");
	}
	static void show() {
		
		System.out.println("Static method show Emp");
	}
}
class Trainee extends Person{
	@Override
	public void display(String name) {
		show();
		super.display(name);
		System.out.println("Indian Trainee");

	}
	static void show() {
	
		System.out.println("Static method show Trainee");
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1=new Trainee();
		System.out.println(t1);
		t1.display(null);
		System.out.println("-----------------------");
		Employee e1=new Employee();
		e1.display(null);
	}

}
